package com.example.calculatorinkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform