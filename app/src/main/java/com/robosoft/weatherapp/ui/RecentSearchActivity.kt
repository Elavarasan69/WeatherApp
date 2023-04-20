package com.robosoft.weatherapp.ui

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.robosoft.weatherapp.R
import com.robosoft.weatherapp.adapter.FavouritesScreenAdapter
import com.robosoft.weatherapp.database.WeatherDB
import com.robosoft.weatherapp.databinding.ActivityRecentSearchBinding
import com.robosoft.weatherapp.dataclass.RecyclerViewItems
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RecentSearchActivity : AppCompatActivity() {
    private lateinit var recentSearchBinding: ActivityRecentSearchBinding
    private lateinit var recyclerView: RecyclerView

    private lateinit var weatherDB: WeatherDB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recentSearchBinding = ActivityRecentSearchBinding.inflate(layoutInflater)
        setContentView(recentSearchBinding.root)

        val backImg = recentSearchBinding.backImg
        backImg.setOnClickListener {
            onBackPressed()
        }

        recentSearchBinding.searchIv.setOnClickListener {
            val intent = Intent(this, SearchScreenActivity::class.java)
            startActivityForResult(intent, 100)
        }

        recyclerView = recentSearchBinding.recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)

        val totalList = arrayListOf<RecyclerViewItems>()

        weatherDB = WeatherDB.getDatabase((applicationContext ?: this))
        GlobalScope.launch {
            val a = weatherDB.weatherDetailsDao().getAllData()
            for (i in a) {
                totalList.add(
                    RecyclerViewItems(
                        i.city,
                        i.fav,
                        i.temperature,
                        i.climateText
                    )
                )
            }
            if (totalList.isEmpty()) {
                recentSearchBinding.noFavouritesLayout.visibility = View.VISIBLE
                recentSearchBinding.favouritesLayout.visibility = View.GONE
            } else recyclerView.adapter = FavouritesScreenAdapter(totalList)

        }

        recentSearchBinding.clearAllTv.setOnClickListener {
            showAlertDialog(totalList)
        }
    }

    private fun showAlertDialog(totalList: ArrayList<RecyclerViewItems>) {

        val builder = AlertDialog.Builder(this)
        //set message for alert dialog
        builder.setMessage("Are you sure want to remove all the recent searches?")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes") { _, _ ->
            recentSearchBinding.noFavouritesLayout.visibility = View.VISIBLE
            recentSearchBinding.favouritesLayout.visibility = View.GONE

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
