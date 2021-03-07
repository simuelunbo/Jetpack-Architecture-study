package com.example.androidappswithjetpackarchitecture.di.auth

import javax.inject.Scope

/**
 * AuthScope는 로그인 하고 회원가입 용도로만 사용
 */
@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class AuthScope