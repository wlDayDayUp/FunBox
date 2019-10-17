package com.wl1217.funbox

import com.wl1217.funlib.utils.RequestConvertUtil
import rxhttp.wrapper.annotation.DefaultDomain

class Url {
    companion object {
        @DefaultDomain
        const val baseUrl = ""

        // 测试签名请求
        const val testSign = ""

        fun doTestSign(username: String, userpwd: String, logintype: String, token: String) =
            RequestConvertUtil.getRequestData(
                hashMapOf(
                    "username" to username,
                    "userpwd" to userpwd,
                    "logintype" to logintype
                ), token
            )

    }
}