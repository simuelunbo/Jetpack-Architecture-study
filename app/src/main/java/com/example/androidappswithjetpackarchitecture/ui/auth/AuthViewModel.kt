package com.example.androidappswithjetpackarchitecture.ui.auth

import androidx.lifecycle.ViewModel
import com.example.androidappswithjetpackarchitecture.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
) : ViewModel()