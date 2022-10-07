package com.lafierage.koltin.multi.plateform.mobile.first.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform