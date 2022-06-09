package com.bimabagaskhoro.pitjarustestapp.ui.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimabagaskhoro.pitjarustestapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_store)
    }
}