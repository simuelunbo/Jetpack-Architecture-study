package com.example.androidappswithjetpackarchitecture.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.androidappswithjetpackarchitecture.api.auth.network_responses.LoginResponse
import com.example.androidappswithjetpackarchitecture.api.auth.network_responses.RegistrationResponse
import com.example.androidappswithjetpackarchitecture.repository.auth.AuthRepository
import com.example.androidappswithjetpackarchitecture.util.GenericApiResponse
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel() {

    fun testLogin(): LiveData<GenericApiResponse<LoginResponse>> {
        return authRepository.testLoginRequest(
            "testunbo11@gmail.com",
            "testunbo11"  // 테스트 코드 하드코딩
        )
    }

    fun testRegister(): LiveData<GenericApiResponse<RegistrationResponse>> {
        return authRepository.testRegistrationRequest(
            "testunbo11@gmail.com",
            "simuel",
            "testunbo11",
            "testunbo11"
        )
    }
}