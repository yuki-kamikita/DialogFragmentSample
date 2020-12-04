package com.example.dialogfragmentsample

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var clicked = 0

    // DatePickerDialogで入力された値を受け取る
    override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val str = String.format(Locale.US, "%d/%d/%d", year, monthOfYear+1, dayOfMonth)
        if (clicked == 1) textView1.text = str
        else textView2.text = str

    }

    // DatePickerダイアログを表示
    fun showDatePickerDialog(v: View) {
        clicked = 1
        val newFragment = DatePickerDialog()
        newFragment.show(supportFragmentManager, "datePicker")
    }

    // DatePickerダイアログを表示
    fun showSecondDatePickerDialog(v: View) {
        clicked = 2
        val newFragment = DatePickerDialog()
        newFragment.show(supportFragmentManager, "datePicker")
    }



}

// 公式：https://developer.android.com/guide/topics/ui/dialogs?hl=ja