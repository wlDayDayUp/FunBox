package com.wl1217.funbox

import android.content.Intent
import android.content.Intent.EXTRA_ALLOW_MULTIPLE
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import com.rxjava.rxlife.RxLife
import com.wl1217.funbox.bean.TestSignBean
import com.wl1217.funlib.base.BaseActivity
import com.wl1217.funlib.utils.CheckUpdateUtil
import com.wl1217.funlib.utils.DESCyptoUtil
import com.wl1217.funlib.utils.log
import com.wl1217.funlib.utils.toast
import kotlinx.android.synthetic.main.activity_main.*
import rxhttp.wrapper.param.RxHttp


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCs.setOnClickListener {

            CheckUpdateUtil.doUpdate(this)


            RxHttp.postForm(Url.testSign)
                .add(
                    Url.doTestSign(
                        "",
                        DESCyptoUtil.encode("Yk_DES@^", "q123456789"),
                        "0",
                        ""
                    )
                )
                .asObject(TestSignBean::class.java)
                .`as`(RxLife.asOnMain(this))
                .subscribe({
                    result_tv.text = it.toString()
                }, {
                    it.printStackTrace()
                })
        }


    }
}
