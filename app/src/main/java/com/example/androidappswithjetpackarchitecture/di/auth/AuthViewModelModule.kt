package com.example.androidappswithjetpackarchitecture.di.auth

import androidx.lifecycle.ViewModel
import com.example.androidappswithjetpackarchitecture.di.ViewModelKey
import com.example.androidappswithjetpackarchitecture.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel

}