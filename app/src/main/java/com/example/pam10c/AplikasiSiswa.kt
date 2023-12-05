package com.example.pam10c

import android.app.Application
import com.example.pam10c.repositori.ContainerApp
import com.example.pam10c.repositori.ContainerDataApp

class AplikasiSiswa: Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}