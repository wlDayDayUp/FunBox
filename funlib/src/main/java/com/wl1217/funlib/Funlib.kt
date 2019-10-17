package com.wl1217.funlib

class Funlib {

    companion object {

        var prm_private_key_sign = "" /*网络请求签名key*/

        /**
         * 初始化
         * @param prm_private_key_sign 网络请求签名key
         */
        fun init(prm_private_key_sign: String) {
            this.prm_private_key_sign = prm_private_key_sign
        }
    }
}