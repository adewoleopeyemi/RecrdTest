package com.recrd.recrdtest.data.model

import com.recrd.recrdtest.domain.models.Cat
import com.recrd.recrdtest.domain.models.ImagesResponse
import com.squareup.moshi.Json


data class ImagesResponseData(
    @Json(name= "breeds")
    val breeds: List<CatResponseData>
)


data class CatResponseData(
    @Json(name= "id")
    val id:String,
    @Json(name="url")
    val url: String,
)


internal fun CatResponseData.toDomain() = Cat(
    id, url
)

