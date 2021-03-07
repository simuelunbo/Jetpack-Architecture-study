package com.example.androidappswithjetpackarchitecture.di


import android.app.Application
import androidx.room.Room
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.androidappswithjetpackarchitecture.R
import com.example.androidappswithjetpackarchitecture.persistence.AccountPropertiesDao
import com.example.androidappswithjetpackarchitecture.persistence.AppDatabase
import com.example.androidappswithjetpackarchitecture.persistence.AppDatabase.Companion.DATABASE_NAME
import com.example.androidappswithjetpackarchitecture.persistence.AuthTokenDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {

    @Singleton // @Singleton은 javax.inject 패키지와 함께 제공되는 유일한 범위 주석이다. 이 주석을 사용하여 ApplicationComponent 및 전체 애플리케이션에서 재사용하려는 객체에 주석을 달 수 있다
    @Provides
    fun provideAppDb(app: Application): AppDatabase {
        return Room
            .databaseBuilder(app, AppDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration() // get correct db version if schema changed
            .build()
    }

    @Singleton
    @Provides
    fun provideAuthTokenDao(db: AppDatabase): AuthTokenDao {
        return db.getAuthTokenDao()
    }

    @Singleton
    @Provides
    fun provideAccountPropertiesDao(db: AppDatabase): AccountPropertiesDao {
        return db.getAccountPropertiesDao()
    }

    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions {
        return RequestOptions
            .placeholderOf(R.drawable.default_image)
            .error(R.drawable.default_image)
    }

    @Singleton
    @Provides
    fun provideGlideInstance(
        application: Application,
        requestOptions: RequestOptions
    ): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

}