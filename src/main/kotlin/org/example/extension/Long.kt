package org.example.extension

import java.text.SimpleDateFormat

fun Long.formattedDate(): String? {
    val sdf = SimpleDateFormat("yyyyMMdd_HHmmss")
    return sdf.format(this)
}