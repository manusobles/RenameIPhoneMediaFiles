package org.example

import org.example.extension.formattedDate
import org.example.media.MediaFileFactory
import java.io.File

class FilenameProvider(
    private val factory: MediaFileFactory = MediaFileFactory()
) {

    fun getFilenames(files: List<File>): Map<File, String> =
        files.mapNotNull { factory.create(it) }
            .groupBy { it.getCaptureMillis()?.formattedDate() }
            .map { entry ->
                if (entry.value.size == 1) {
                    val extension = "." + entry.value.first().file.extension.toLowerCase()
                    listOf(entry.value.first().file to entry.key + extension)
                } else {
                    entry.value.mapIndexed { index, _ ->
                        val extension = "." + entry.value[index].file.extension.toLowerCase()
                        val number = (index + 1).toString().padStart(3, '0')
                        entry.value[index].file to entry.key + "_" + number + extension
                    }
                }
            }
            .flatten()
            .toMap()
}