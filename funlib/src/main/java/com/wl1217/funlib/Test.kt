package com.wl1217.funlib

import com.wl1217.funlib.utils.md5
import com.wl1217.funlib.utils.sha1
import com.wl1217.funlib.utils.sha256

fun main() {
    println("MD5: ${"123456".md5()}")
    println("SHA1: ${"123456".sha1()}")
    println("SHA256: ${"123456".sha256()}")
}