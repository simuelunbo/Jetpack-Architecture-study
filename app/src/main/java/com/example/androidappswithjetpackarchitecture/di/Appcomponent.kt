package com.example.androidappswithjetpackarchitecture.di

import android.app.Application
import com.example.androidappswithjetpackarchitecture.BaseApplication
import com.example.androidappswithjetpackarchitecture.session.SessionManager
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuildersModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    val sessionManager: SessionManager // 추상 클래스에서 여기에 b/c 주입 추가 해야함

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}

