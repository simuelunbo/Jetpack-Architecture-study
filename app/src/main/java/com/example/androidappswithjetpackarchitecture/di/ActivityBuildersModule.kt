package com.example.androidappswithjetpackarchitecture.di

import com.example.androidappswithjetpackarchitecture.di.auth.AuthFragmentBuildersModule
import com.example.androidappswithjetpackarchitecture.di.auth.AuthModule
import com.example.androidappswithjetpackarchitecture.di.auth.AuthScope
import com.example.androidappswithjetpackarchitecture.di.auth.AuthViewModelModule
import com.example.androidappswithjetpackarchitecture.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}