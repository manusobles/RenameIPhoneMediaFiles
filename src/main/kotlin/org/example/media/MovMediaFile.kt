package org.example.media

import com.drew.imaging.ImageMetadataReader
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory
import java.io.File

class MovMediaFile(
    override val file: File
) : MediaFile {

    override fun getCaptureMillis(): Long? =
        ImageMetadataReader.readMetadata(file).directories
            .firstOrNull { it is QuickTimeMetadataDirectory }
            ?.getDate(TAG_TYPE)
            ?.toInstant()
            ?.toEpochMilli()

    companion object {
        private const val TAG_TYPE = 1286
        val EXTENSIONS = listOf("MOV")
    }
}