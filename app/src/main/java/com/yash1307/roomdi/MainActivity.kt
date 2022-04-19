package com.yash1307.roomdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.yash1307.roomdi.application.DetailsApplication
import com.yash1307.roomdi.entity.Details
import com.yash1307.roomdi.factory.DetailsFactory
import com.yash1307.roomdi.viewmodel.DetailsViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var detailsViewModel: DetailsViewModel

    @Inject
    lateinit var detailsFactory: DetailsFactory


    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DetailsApplication).detailsComponent.inject(this)
        detailsViewModel = ViewModelProvider(this, detailsFactory)[DetailsViewModel::class.java]

        textView = findViewById(R.id.textView)

        detailsViewModel.insertDetails(Details("yash", 1))

        detailsViewModel.detailsLiveData.observe(this, Observer {
            textView.text = it.toString()
        })
    }
}