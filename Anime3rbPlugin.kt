package com.anime3rb

class Anime3rbPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anime3rb())
    }
}
