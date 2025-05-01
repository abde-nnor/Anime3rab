package com.anime3rb

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

// مثال مبسط لبداية إضافة لموقع Anime3rb
class Anime3rb : MainAPI() {
    override var mainUrl = "https://anime3rb.com"
    override var name = "Anime3rb"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Anime)

    override suspend fun loadMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // كود جلب الصفحة الرئيسية
        return HomePageResponse(emptyList())
    }
}
