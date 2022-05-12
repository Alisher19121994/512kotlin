package com.example.a512kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
    }

    private fun open() {
        recyclerView = findViewById(R.id.main_R_id)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val list = ArrayList<Int>()
        list.add(R.raw.cycling)
        list.add(R.raw.facebook)
        list.add(R.raw.c_2)
        val adapter = Adapter(list)
        recyclerView.adapter = adapter
    }
}