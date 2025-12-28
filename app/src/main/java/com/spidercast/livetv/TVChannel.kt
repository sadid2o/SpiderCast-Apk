package com.spidercast.livetv

data class TVChannel(
    val id: Int,
    val name: String,
    val streamUrl: String,
    val category: String,
    val logoUrl: String? = null
)
