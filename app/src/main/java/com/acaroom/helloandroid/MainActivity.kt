package com.acaroom.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val tvTitle = findViewById<TextView>(R.id.tv_title)
        //tvTitle.text = "Hello Kotlin!"

        tv_title.text = "Hello Kotlin! again!~" // 합성 프로퍼티의 사용

    }
}
