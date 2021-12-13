package com.ronha.spike.navigation.extensions

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @see https://wajahatkarim.com/2019/03/-launching-activities-in-easier-way-using-kotlin-extensions-/
 */
inline fun <reified T : Any> AppCompatActivity.launchActivity(
    requestCode: Int = -1,
    options: Bundle? = null,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = newIntent<T>(this)
    intent.init()
    startActivityForResult(intent, requestCode)
}

inline fun <reified T : Any> AppCompatActivity.launchActivity(
    options: Bundle? = null,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = newIntent<T>(this)
    intent.init()
    startActivity(intent)
}

inline fun <reified T : Any> AppCompatActivity.launchActivity(
    options: Bundle? = null,
    finished: Boolean = false,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = newIntent<T>(this)
    intent.init()
    startActivity(intent)
    if (finished) {
        finish()
    }
}

inline fun <reified T : Any> newIntent(context: Context): Intent = Intent(context, T::class.java)