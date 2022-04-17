package com.commanderhr1.todolist

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var itemList = arrayListOf<String>()
    var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, itemList)

    // onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}