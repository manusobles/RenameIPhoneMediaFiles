package org.example.media

import com.drew.imaging.ImageMetadataReader
import com.drew.metadata.exif.ExifIFD0Directory
import java.io.File

class JpegMediaFile(
    override val file: File
) : MediaFile {

    override fun getCaptureMillis(): Long? =
        ImageMetadataReader.readMetadata(file).directories
            .firstOrNull { it is ExifIFD0Directory }
            ?.getDate(TAG_TYPE)
            ?.toInstant()
            ?.toEpochMilli()

    companion object {
        private const val TAG_TYPE = 306
        val EXTENSIONS = listOf("JPG", "JPEG")
    }
}