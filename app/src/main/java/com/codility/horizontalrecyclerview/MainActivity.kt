package com.codility.horizontalrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.codility.horizontalrecyclerview.model.Version
import com.codility.horizontalrecyclerview.utils.Utility
import com.codility.recyclerpicasso.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Utility.isOnline(this)) {
            displayList()
        } else {
            Toast.makeText(this, R.string.no_internet, Toast.LENGTH_SHORT).show()
        }
    }

    private fun displayList() {
        val version = ArrayList<Version>()
        version.addAll(Version.getList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        recyclerView.adapter = MyAdapter(version)
    }
}
