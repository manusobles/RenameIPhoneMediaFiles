package org.example

import java.io.File

fun main() {

    val folder = File("""__FOLDER_PATH_HERE__""")
    val files = folder.listFiles()?.filter { it.isFile } ?: return

    println("Total files: ${files.size}")

    val filenames = FilenameProvider().getFilenames(files)

    if (files.size != filenames.size) throw IllegalStateException("Filenames missing: ${files.size} > ${filenames.size}")

    FileRenamer().rename(filenames)

    println("${filenames.size} files renamed ✔")
}