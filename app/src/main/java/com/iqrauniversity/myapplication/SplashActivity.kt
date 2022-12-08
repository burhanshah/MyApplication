
package com.iqrauniversity.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class SplashActivity : AppCompatActivity() {

    private val hanlder = Handler()
    private lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        runnable = Runnable {
            /*val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)*/

            Intent(this,LoginActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }

        hanlder.postDelayed(runnable, 3000)
    }

    override fun onStop() {
        super.onStop()
        hanlder.removeCallbacks(runnable)
    }
}