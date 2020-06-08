package org.example.media

import java.io.File

interface MediaFile {
    val file: File

    fun getCaptureMillis(): Long?
}