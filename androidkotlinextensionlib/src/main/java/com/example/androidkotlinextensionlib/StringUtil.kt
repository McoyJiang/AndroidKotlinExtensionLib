package com.example.androidkotlinextensionlib

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v4.content.ContextCompat

/**
 * Created by Danny on 17/11/8.
 */

/**
 * turn String into an Intent for specified Activity
 *
 * set Intent.ACTION_VIEW action & data from string url
 */
fun String.urlIntent(): Intent =
        Intent(Intent.ACTION_VIEW).setData(Uri.parse(this))

/**
 * get if the Context has the permission decided by this String
 */
fun String.hasPermission(context: Context): Boolean =
        ContextCompat.checkSelfPermission(context, this) == PackageManager.PERMISSION_GRANTED