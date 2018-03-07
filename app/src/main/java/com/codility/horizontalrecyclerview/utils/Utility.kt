package com.codility.horizontalrecyclerview.utils

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager


/**
 * Created by Govind on 3/7/2018.
 */
object Utility {

    @SuppressLint("MissingPermission")
    fun isOnline(context: Context): Boolean{
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo.isConnectedOrConnecting
    }
}