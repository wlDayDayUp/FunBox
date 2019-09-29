package com.wl1217.funbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wl1217.funlib.utils.log
import com.wl1217.funlib.utils.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "Welcome on Android".toast(this)

        "你好！".log()

    }
}
