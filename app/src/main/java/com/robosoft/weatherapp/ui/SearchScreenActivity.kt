package com.robosoft.weatherapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.robosoft.weatherapp.databinding.ActivitySearchScreenBinding

import kotlinx.android.synthetic.main.activity_search_screen.*

class SearchScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val backBtn = binding.backToolbar.getChildAt(0)
        backBtn.setOnClickListener {
            onBackPressed()
        }

        binding.searchedt.addTextChangedListener(textWatcher)

        binding.clearTxt.setOnClickListener {
            binding.searchedt.text.clear()
        }

        show_result.setOnClickListener {

            val cityValue = searchedt.text.toString()
            val intent = Intent()
            intent.putExtra("city", cityValue)
            setResult(100,intent)
            finish()

        }
    }
    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            binding.showResult.visibility = View.VISIBLE
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            binding.clearTxt.visibility = View.VISIBLE
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }
    }
}
