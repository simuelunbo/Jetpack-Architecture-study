package com.example.androidappswithjetpackarchitecture.session

import android.app.Application
import com.example.androidappswithjetpackarchitecture.persistence.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {

}