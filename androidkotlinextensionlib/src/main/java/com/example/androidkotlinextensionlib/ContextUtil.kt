package com.example.androidkotlinextensionlib

import android.content.Context
import android.widget.Toast

/**
 * Created by Danny on 17/11/8.
 */

/**
 * show Toast in Activity
 */
fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
