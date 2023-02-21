package com.recrd.recrdtest.data.model

import com.recrd.recrdtest.domain.models.Cat
import com.squareup.moshi.Json


data class ImagesResponseData(
    @Json(name= "breeds")
    val breeds: List<CatData>
)


data class CatData(
    @Json(name= "id")
    val id:String,
    @Json(name="url")
    val url: String,
)


internal fun CatData.toDomain() = Cat(
    id, url
)

