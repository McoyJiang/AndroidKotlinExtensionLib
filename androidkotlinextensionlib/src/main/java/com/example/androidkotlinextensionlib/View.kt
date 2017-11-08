package com.example.androidkotlinextensionlib

import android.view.View

/**
 * Created by Danny on 17/11/8.
 */

/**
 * set if the View is visible
 */
fun View.setVisibleIf(condition: Boolean) {
    visibility = if (condition) View.VISIBLE else View.GONE
}