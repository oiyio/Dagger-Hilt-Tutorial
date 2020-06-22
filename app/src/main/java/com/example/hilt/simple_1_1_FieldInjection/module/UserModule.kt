package com.example.hilt.simple_1_1_FieldInjection.module

import android.content.Context
import com.example.hilt.simple_1_1_FieldInjection.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object UserModule {

    @Provides
    @Singleton
    fun provideUser(@ApplicationContext appContext: Context): User {
        return User(appContext)
    }

}
