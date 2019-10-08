package com.wl1217.funbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wl1217.funlib.utils.log
import com.wl1217.funlib.utils.toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "Welcome on Android".toast(this)

        "你好！".log()

        getCs.setOnClickListener {
//            RxHttp.get("")
//            RxHttp.get(Api.getCs)
//                .add("username", "weee")
//                .add("age", "123")
//                .asObject(GetTestBean::class.java)
//                .`as`(RxLife.asOnMain(this))
//                .subscribe({
//                    it.toString().log()
//                }, {
//                    it.printStackTrace()
//                    it.message?.log()
//                })
        }

    }
}
