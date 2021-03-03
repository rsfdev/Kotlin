package com.everis.listadecontatos.application

import android.app.Application
import com.everis.listadecontatos.helpers.HelperDB

class ContatoApplication : Application() {

    var helperDB: HelperDB? = null
        private set //bloqueada para SET externo, apenas GET

    companion object {
        lateinit var instance: ContatoApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        helperDB = HelperDB(this)
    }
}