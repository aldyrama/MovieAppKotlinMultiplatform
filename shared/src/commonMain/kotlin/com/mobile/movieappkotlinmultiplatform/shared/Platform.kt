package com.mobile.movieappkotlinmultiplatform.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform