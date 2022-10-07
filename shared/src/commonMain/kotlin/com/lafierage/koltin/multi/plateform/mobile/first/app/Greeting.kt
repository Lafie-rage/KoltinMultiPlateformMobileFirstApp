package com.lafierage.koltin.multi.plateform.mobile.first.app

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}