package com.robosoft.weatherapp.adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.checkbox.MaterialCheckBox
import com.robosoft.weatherapp.R
import com.robosoft.weatherapp.dataclass.RecyclerViewItems

class FavouritesScreenAdapter(private val totalList: ArrayList<RecyclerViewItems>) : RecyclerView.Adapter<FavouritesScreenAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = totalList[position]

        if (itemsViewModel.fav == null)
            holder.favouriteCheckedBox.isChecked = false
        holder.place.text = itemsViewModel.place
        holder.temperature.text = itemsViewModel.temperature
        holder.climateText.text = itemsViewModel.climateText
    }

    override fun getItemCount(): Int {
        return totalList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val place: TextView = itemView.findViewById(R.id.place_tv)
        val favouriteCheckedBox: MaterialCheckBox = itemView.findViewById(R.id.favouriteCheckedBox)
        val temperature: TextView = itemView.findViewById(R.id.temperature_tv)
        val climateText: TextView = itemView.findViewById(R.id.climate_tv)
    }
}