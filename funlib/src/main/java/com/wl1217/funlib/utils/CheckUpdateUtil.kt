package com.wl1217.funlib.utils

import android.app.ProgressDialog
import com.wl1217.funlib.base.BaseActivity

class CheckUpdateUtil {
    companion object INSTANCE {

        private var loadingDialog: ProgressDialog? = null
        private var baseActivity: BaseActivity? = null

        /*
            检查更新
         */
        fun doUpdate(baseActivity: BaseActivity) {
            this.baseActivity = baseActivity

            this.showLoadingDialog()

        }


        private fun showLoadingDialog() {
            baseActivity?.let {
                loadingDialog = ProgressDialog(baseActivity).apply {
                    this.setMessage("正在请求……")
                    this.show()
                }

            }

        }
    }
}