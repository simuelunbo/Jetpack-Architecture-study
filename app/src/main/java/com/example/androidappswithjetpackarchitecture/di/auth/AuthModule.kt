package com.example.androidappswithjetpackarchitecture.di.auth

import com.example.androidappswithjetpackarchitecture.api.auth.OpenApiAuthService
import com.example.androidappswithjetpackarchitecture.persistence.AccountPropertiesDao
import com.example.androidappswithjetpackarchitecture.persistence.AuthTokenDao
import com.example.androidappswithjetpackarchitecture.repository.auth.AuthRepository
import com.example.androidappswithjetpackarchitecture.session.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule {

    // TEMPORARY
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }

}