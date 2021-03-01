package com.example.androidappswithjetpackarchitecture.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidappswithjetpackarchitecture.models.AccountProperties
import com.example.androidappswithjetpackarchitecture.models.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object {

        const val DATABASE_NAME = "my_app_db"
    }
}