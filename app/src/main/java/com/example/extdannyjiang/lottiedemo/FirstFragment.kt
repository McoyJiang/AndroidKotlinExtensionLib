package com.example.extdannyjiang.lottiedemo

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.androidkotlinextensionlib.withArguments

/**
 * Created by Danny on 17/11/8.
 */

class FirstFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        withArguments()
    }
}