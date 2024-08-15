package com.mobile.movieappkotlinmultiplatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hellooooo, ${platform.name}!"
    }
}