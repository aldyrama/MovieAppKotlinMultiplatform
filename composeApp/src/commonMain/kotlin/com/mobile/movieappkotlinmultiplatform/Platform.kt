package com.mobile.movieappkotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform