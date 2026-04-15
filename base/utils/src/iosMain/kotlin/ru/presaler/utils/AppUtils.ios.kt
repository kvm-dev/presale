package ru.presaler.utils

import platform.posix.exit

actual fun closeApp(){
    exit(0)
}