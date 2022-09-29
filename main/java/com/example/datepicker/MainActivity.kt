package com.example.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.datepicker.viewmodel.DateViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel: DateViewModel = ViewModelProvider(this)[DateViewModel::class.java]

        val chooseBtn = findViewById<Button>(R.id.dateButton)
        val datePickerFragment = DatePickerFragment()
        chooseBtn.setOnClickListener {
            datePickerFragment.show(supportFragmentManager, "datePicker")
            Toast.makeText(this, "DATE: ${viewModel.date}/${viewModel.month}/${viewModel.year}",Toast.LENGTH_SHORT).show()
        }

    }
}
