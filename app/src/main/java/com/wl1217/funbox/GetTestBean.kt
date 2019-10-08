package com.wl1217.funbox

data class GetTestBean(
    val info: GetTestBean_Info,
    val msg: String,
    val success: Boolean
)

data class GetTestBean_Info(
    val phone: String
)