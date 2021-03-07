package com.example.androidappswithjetpackarchitecture.di.auth

import com.example.androidappswithjetpackarchitecture.ui.auth.ForgotPasswordFragment
import com.example.androidappswithjetpackarchitecture.ui.auth.LauncherFragment
import com.example.androidappswithjetpackarchitecture.ui.auth.LoginFragment
import com.example.androidappswithjetpackarchitecture.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

}