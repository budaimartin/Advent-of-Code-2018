package common

import java.io.File

fun readLines(fileName: String): List<String> =	File("resources/${fileName}").readLines()
