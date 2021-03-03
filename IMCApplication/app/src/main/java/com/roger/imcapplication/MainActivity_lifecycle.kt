package com.roger.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "CREATE - criação da tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "START - tela visível")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "RESUME - agora se pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - tela perdeu o foco, não se pode mais interagir")
    }

    override fun onStop() {
        Log.w("lifecycle", "STOP - tela não mais visível, entretanto ainda existe")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "RESTART - tela retomando o foco")

    }

    override fun onDestroy() {
        Log.w("lifecycle", "DESTROY - tela destruída")
        super.onDestroy()
    }
}