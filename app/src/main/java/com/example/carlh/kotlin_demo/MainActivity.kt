package com.example.carlh.kotlin_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.carl_library.Leave_Company

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylibrary = Leave_Company()
        mylibrary.自願離職()
        var sss = 1

    }
}
