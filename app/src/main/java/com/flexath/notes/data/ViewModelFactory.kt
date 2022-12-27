package com.flexath.notes.data

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// Should read from this link - https://dev.to/theplebdev/understanding-the-viewmodelproviderfactory-in-android-with-kotlin-11dp

class ViewModelFactory(private val repository: NoteRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(NoteViewModel::class.java)){
            return NoteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model class")
    }
}
