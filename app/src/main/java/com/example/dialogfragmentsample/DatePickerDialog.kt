package com.example.dialogfragmentsample

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import android.app.DatePickerDialog

class DatePickerDialog : DialogFragment(), DatePickerDialog.OnDateSetListener {

    // 今日の日付をDatePickerDialogにセット
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = java.util.Calendar.getInstance()
        val year = c.get(java.util.Calendar.YEAR)
        val month = c.get(java.util.Calendar.MONTH)
        val day = c.get(java.util.Calendar.DAY_OF_MONTH)

        return DatePickerDialog(
            this.context as Context,
            activity as MainActivity?,
            year, month, day
        )
    }

    // 選択した日付を返す
    override fun onDateSet(
        view: DatePicker,
        year: Int,
        monthOfYear: Int,
        dayOfMonth: Int) {
    }
}