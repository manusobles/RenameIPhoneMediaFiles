package org.example.media

import java.io.File

class MediaFileFactory {
    fun create(file: File): MediaFile? {
        if (!file.isFile) return null

        val extension = file.extension.toUpperCase()

        if (JpegMediaFile.EXTENSIONS.contains(extension)) return JpegMediaFile(file)
        if (MovMediaFile.EXTENSIONS.contains(extension)) return MovMediaFile(file)

        return null
    }
}