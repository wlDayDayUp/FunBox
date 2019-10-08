package com.wl1217.funlib

class FunBox {
    companion object INSTANCE {
        private var baseUrl: String? = null

        fun init(baseUrl: String) {
            this.baseUrl = baseUrl
        }

        fun getBaseUrl(): String {
            return if (baseUrl == null || "".equals(baseUrl)) throw Exception("请初始化BaseUrl") else baseUrl!!
        }
    }

}