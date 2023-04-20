package com.robosoft.weatherapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.robosoft.weatherapp.R
import com.robosoft.weatherapp.database.WeatherDB
import com.robosoft.weatherapp.dataclass.WeatherData
import com.robosoft.weatherapp.dataclass.WeatherDetails
import com.robosoft.weatherapp.objects.RetrofitHelper
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt


class HomeActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var weatherDB: WeatherDB

    private var requiredCity = "Karur"


    @OptIn(DelicateCoroutinesApi::class)
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        weatherDB = WeatherDB.getDatabase((applicationContext ?: this))
        favClicked.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Log.d("ghj", requiredCity)
                GlobalScope.launch {
                    weatherDB.weatherDetailsDao().update(
                        requiredCity, favorite = "f"
                    )
                }
            } else {
                GlobalScope.launch {
                    weatherDB.weatherDetailsDao().update(
                        requiredCity, favorite = null
                    )
                }
            }
        }

        getWeather(requiredCity)

        val formattedDate = SimpleDateFormat("E, dd MMM yyyy    hh:mm a").format(Date())

        dateTimeTv.text = formattedDate


        favClicked.apply {
            setOnClickListener {
                if (this.isChecked)
                    addFavTv.text = context.getString(R.string.addedtofav)
                else
                    addFavTv.text = context.getString(R.string.addtofav)
            }
        }

        var cclicked = false
        cTv.setOnClickListener {
            if (cclicked) {
                Log.d("c", "Clicked")
                cTv.setBackgroundColor(resources.getColor(R.color.white))
                cTv.setTextColor(resources.getColor(R.color.red))

                fTv.setBackgroundColor(Color.TRANSPARENT)
                fTv.setTextColor(Color.WHITE)

                celValueTv.text = ((((celValueTv.text.toString()
                    .toDouble() - 32) * 5 / 9) * 100.0).roundToInt() / 100.0).toString()

                cclicked = false
            }
        }

        fTv.setOnClickListener {
            if (!cclicked) {

                fTv.setBackgroundColor(Color.WHITE)
                fTv.setTextColor(Color.RED)

                cTv.setBackgroundColor(Color.TRANSPARENT)
                cTv.setTextColor(Color.WHITE)

                celValueTv.text = ((((celValueTv.text.toString()
                    .toDouble() * 9 / 5) + 32) * 100.0).roundToInt() / 100.0).toString()

                cclicked = true
            }
        }


        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)

        setSupportActionBar(toolbar)

        navView.menu.findItem(R.id.nav_home)
        navView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.nav_home -> startActivity(Intent(this, HomeActivity::class.java))
                R.id.nav_favorite -> startActivity(Intent(this, FavoriteActivity::class.java))
                R.id.nav_recent_search -> startActivity(
                    Intent(
                        this,
                        RecentSearchActivity::class.java
                    )
                )
            }

            true
        }

    }

    private fun getWeather(requiredCity: String) {

        val weatherApi = RetrofitHelper.getInstance()

        GlobalScope.launch {
            val result = weatherApi.getData(requiredCity)

            result.enqueue(object : Callback<WeatherData> {
                override fun onResponse(call: Call<WeatherData>, response: Response<WeatherData>) {

                    val data = response.body().toString()
                    Log.d("data", data)
                    if (data == null) {
                        Toast.makeText(
                            applicationContext, "Please enter the city name correctly",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        val a = 273

                        response.body()?.apply {
                            locationTv.text = "$name, ${sys.country}"

                            val temp = ((((main.temp.minus(a)).times(100.0)).roundToInt()).div(
                                100.0
                            )).toString()
                            celValueTv.text = temp


                            var desc = ""
                            for (i in weather[0].description.split(' '))
                                desc += i[0].uppercase() + i.substring(1) + " "

                            sunny_txt.text = desc

                            minmaxTv.text =
                                ((((main.temp_min.minus(a)).times(100.0)).roundToInt()).div(
                                    100.0
                                )).toString() + "\u00B0-" + ((((main.temp_max.minus(a)).times(100.0)).roundToInt()).div(
                                    100.0
                                )).toString() + "\u00B0"

                            windTv.text = wind.speed.toString() + "%"

                            humidityTv.text = main.humidity.toString() + "%"

                            insertSiteDetails(name, "$temp\u00B0c", desc)
                            Log.d("msg", this.toString())
                        }
                    }
                }

                override fun onFailure(call: Call<WeatherData>, t: Throwable) {

                }


            })
        }
    }

    private fun insertSiteDetails(
        city: String,
        temp: String,
        desc: String
    ) {
        weatherDB = WeatherDB.getDatabase(applicationContext ?: this)

        GlobalScope.launch {
            val selectedCity = weatherDB.weatherDetailsDao().getSelectedCity(
                requiredCity
            )
            if (selectedCity.isEmpty()) {
                weatherDB.weatherDetailsDao().insert(
                    WeatherDetails(
                        null,
                        city,
                        fav = null,
                        temp,
                        desc
                    )
                )
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemview = item.itemId

        if (itemview == R.id.app_bar_search) {

            val intent = Intent(this, SearchScreenActivity::class.java)
            startActivityForResult(intent, 100)
        }


        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        favClicked.isChecked = false
        if (resultCode == 100) {
            requiredCity = data?.getStringExtra("city").toString()
            getWeather(requiredCity)
        }
    }
}