package com.example.androidkotlinextensionlib

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Danny on 17/11/8.
 */

/**
 * inflate the layout by LayoutRes
 *
 * @layout the ID of layout xml
 * @attachToRoot if attach the layout into this ViewGroup
 */
fun ViewGroup.inflate(@LayoutRes layout: Int, attachToRoot: Boolean = true): View =
        LayoutInflater.from(context).inflate(layout, this, attachToRoot)

/**
 * get the iterator of ViewGroup's children
 */
val ViewGroup.children: List<out View>
    get() = (0 until childCount).map { getChildAt(it) }
