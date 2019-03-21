package com.example.waterfall

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productView()
        tagView()


    }


    fun productView() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_product)
        recyclerView.setHasFixedSize(true)
        val pAdapter = ProductAdapter()

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        (recyclerView.layoutManager as StaggeredGridLayoutManager).gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE

        recyclerView.adapter = pAdapter
    }

    fun tagView() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_tag)
        recyclerView.setHasFixedSize(true)
        val tAdapter = TagAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        recyclerView.adapter = tAdapter

    }


}
