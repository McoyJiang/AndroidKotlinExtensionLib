package com.example.extdannyjiang.lottiedemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.androidkotlinextensionlib.withArguments

/**
 * Created by Danny on 17/11/8.
 */
class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?,
                          persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        firstFragment.withArguments(
                Pair("", false),
                Pair("", 10)
        )
    }
}