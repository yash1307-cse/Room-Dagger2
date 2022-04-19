package com.yash1307.roomdi.application

import android.app.Application
import com.yash1307.roomdi.component.DaggerDetailsComponent
import com.yash1307.roomdi.component.DetailsComponent

class DetailsApplication: Application() {

    lateinit var detailsComponent: DetailsComponent

    override fun onCreate() {
        super.onCreate()
        detailsComponent = DaggerDetailsComponent.factory().createFactory(this)
    }
}