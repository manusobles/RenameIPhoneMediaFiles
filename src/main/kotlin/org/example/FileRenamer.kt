package org.example

import java.io.File

class FileRenamer {
    fun rename(filenames: Map<File, String>) {
        filenames.mapValues { File(it.key.parent, it.value) }
            .forEach { (origin, destination) -> origin.renameTo(destination) }
    }
}