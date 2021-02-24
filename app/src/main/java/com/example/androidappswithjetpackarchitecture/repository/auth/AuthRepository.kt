package com.example.androidappswithjetpackarchitecture.repository.auth

import com.example.androidappswithjetpackarchitecture.api.auth.OpenApiAuthService
import com.example.androidappswithjetpackarchitecture.persistence.AccountPropertiesDao
import com.example.androidappswithjetpackarchitecture.persistence.AuthTokenDao
import com.example.androidappswithjetpackarchitecture.session.SessionManager

class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
) {

}