package com.flexath.notes.data

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.flexath.notes.data.room.NoteEntity
import kotlinx.coroutines.launch

class NoteViewModel(private val repo:NoteRepository) : ViewModel(),Observable {

    var noteList: LiveData<List<NoteEntity>>? = null

    init {
        noteList = repo.getAllNotes
    }

    fun insertNote(note:NoteEntity) = viewModelScope.launch {
        repo.insertNote(note)
    }

    fun updateNote(note: NoteEntity) = viewModelScope.launch {
        repo.updateNote(note)
    }

    fun deleteNote(note:NoteEntity) = viewModelScope.launch {
        repo.deleteNote(note)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}