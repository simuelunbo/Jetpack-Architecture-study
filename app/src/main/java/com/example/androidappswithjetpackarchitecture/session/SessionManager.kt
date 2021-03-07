package com.example.androidappswithjetpackarchitecture.session

import android.app.Application
import com.example.androidappswithjetpackarchitecture.persistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {

}