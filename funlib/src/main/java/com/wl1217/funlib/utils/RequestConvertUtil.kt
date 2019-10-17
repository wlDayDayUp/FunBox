package com.wl1217.funlib.utils

import android.util.Log
import com.blankj.utilcode.util.DeviceUtils
import com.wl1217.funlib.Funlib
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap


/**
 *
 */
object RequestConvertUtil {

    /**
     * 拼接请求参数 xxx=xxx&xxx=xxx
     */
    private fun toRequestConts(map: HashMap<String, String>): String {

        val requestBaseParameter = RequestConvertUtil.requestBaseParameter()

        map.forEach { (key, value) ->
            requestBaseParameter.append(key).append("=").append(value).append("&")
        }

        return requestBaseParameter.toString()
    }

    /**
     * 获取请求参数签名
     */
    private fun toRequestSign(prm_private_key_sign: String, s: String) =
        SignUtil.sign(
            prm_private_key_sign, s
        )

    /**
     * 公共请求参数
     */
    private fun requestBaseParameter(): StringBuffer {
        return StringBuffer()
            .append("appid=").append(DeviceUtils.getUniqueDeviceId()).append("&")/*设备唯一编号*/
            .append("time=").append(Date().format("yyyyMMddHHmmss")).append("&")/*时间*/
            .append("ftype=").append("Android").append("&")
    }

    /**
     * 组装请求参数
     */
    fun getRequestData(
        parameter: HashMap<String, String>,
        token: String,
        prm_private_key_sign: String = Funlib.prm_private_key_sign
    ): HashMap<String, String> {
        return hashMapOf(
            "conts" to toRequestConts(parameter),
            "sign" to toRequestSign(prm_private_key_sign, toRequestConts(parameter)),
            "token" to token
        )
    }
}