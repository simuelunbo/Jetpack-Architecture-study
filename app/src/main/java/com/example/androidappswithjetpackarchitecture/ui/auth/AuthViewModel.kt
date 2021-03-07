package com.example.androidappswithjetpackarchitecture.ui.auth

import androidx.lifecycle.ViewModel
import com.example.androidappswithjetpackarchitecture.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel()