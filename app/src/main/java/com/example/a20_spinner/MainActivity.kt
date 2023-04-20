package com.example.a20_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countries = arrayOf("India", "Australia", "Canada","America","Denmark","Brazil")
        var arrAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries)
        countriesSP.adapter = arrAdapter

        countriesSP.onItemSelectedListener =object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var selectedoption = countries[p2]
                selectedTV.text = selectedoption
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}