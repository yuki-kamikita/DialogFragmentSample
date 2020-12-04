package com.example.dialogfragmentsample

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
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


    // DatePickerDialogで入力された値を受け取る
    override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val str = String.format(Locale.US, "%d/%d/%d", year, monthOfYear+1, dayOfMonth)
        textView1.text = str

    }

    // DatePickerダイアログを表示
    fun showDatePickerDialog(v: View) {
        val newFragment = DatePickerDialog()
        newFragment.show(supportFragmentManager, "datePicker")
    }

// これで二つの異なるダイアログ出せると思うんだけどよくわからない
//    var from_year:Int = 0
//    var from_month:Int = 0
//    var from_day:Int = 0
//    var to_year:Int = 0
//    var to_month:Int = 0
//    var to_day:Int = 0 //initialize them to current date in onStart()/onCreate()
////    lateinit var from_dateListener:DatePickerDialog.OnDateSetListener
////    lateinit var to_dateListener:DatePickerDialog.OnDateSetListener
//
//    var from_dateListener = object:OnDateSetListener() {
//        override fun onDateSet(arg0:DatePicker, arg1:Int, arg2:Int, arg3:Int) {}
//    }
//    var to_dateListener = object:OnDateSetListener() {
//        override fun onDateSet(arg0:DatePicker, arg1:Int, arg2:Int, arg3:Int) {}
//    }
//
//    var DATE_PICKER_TO = 0
//    var DATE_PICKER_FROM = 1
//    override fun onCreateDialog(id:Int): Dialog {
//        when (id) {
//            DATE_PICKER_FROM -> return DatePickerDialog(this, from_dateListener, from_year, from_month, from_day)
//            DATE_PICKER_TO -> return DatePickerDialog(this, to_dateListener, to_year, to_month, to_day)
//        }
//        return null
//    }

}

// 公式：https://developer.android.com/guide/topics/ui/dialogs?hl=ja