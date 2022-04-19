package com.yash1307.roomdi.component

import android.content.Context
import com.yash1307.roomdi.MainActivity
import com.yash1307.roomdi.module.DetailsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DetailsModule::class])
interface DetailsComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun createFactory(@BindsInstance context: Context): DetailsComponent
    }
}