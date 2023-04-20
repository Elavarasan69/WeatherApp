package com.robosoft.weatherapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.robosoft.weatherapp.adapter.FavouritesScreenAdapter
import com.robosoft.weatherapp.database.WeatherDB
import com.robosoft.weatherapp.databinding.ActivityFavoriteBinding
import com.robosoft.weatherapp.dataclass.RecyclerViewItems
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FavoriteActivity : AppCompatActivity() {

    private lateinit var favoriteBinding: ActivityFavoriteBinding
    private lateinit var recyclerView: RecyclerView

    private lateinit var weatherDB: WeatherDB

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        favoriteBinding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(favoriteBinding.root)

        val backImg = favoriteBinding.backImg
        backImg.setOnClickListener {
            onBackPressed()
        }

        favoriteBinding.searchIv.setOnClickListener {
                val intent = Intent(this, SearchScreenActivity::class.java)
                startActivityForResult(intent, 100)
        }

        recyclerView = favoriteBinding.recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)

        val totalList = arrayListOf<RecyclerViewItems>()

        weatherDB = WeatherDB.getDatabase((applicationContext ?: this))
        GlobalScope.launch {
            val a = weatherDB.weatherDetailsDao().getAllData()
            for (i in a) {
                if (i.fav == "f") {
                    totalList.add(
                        RecyclerViewItems(
                            i.city,
                            i.fav,
                            i.temperature,
                            i.climateText
                        )
                    )
                }
            }
            if (totalList.isEmpty()) {
                favoriteBinding.noFavouritesLayout.visibility = View.VISIBLE
                favoriteBinding.favouritesLayout.visibility = View.GONE
            } else recyclerView.adapter = FavouritesScreenAdapter(totalList)

            favoriteBinding.favouritesCount.text = "${totalList.size} City added as favourite"
        }

        favoriteBinding.removeAllTv.setOnClickListener {
            showAlertDialog(totalList)
        }
    }

    private fun showAlertDialog(totalList: ArrayList<RecyclerViewItems>) {

        val builder = AlertDialog.Builder(this)
        //set message for alert dialog
        builder.setMessage("Are you sure want to remove all the favourites?")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes") { _, _ ->
            favoriteBinding.noFavouritesLayout.visibility = View.VISIBLE
            favoriteBinding.favouritesLayout.visibility = View.GONE

            totalList.clear()
        }
        //performing negative action
        builder.setNegativeButton("No") { _, _ ->
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}