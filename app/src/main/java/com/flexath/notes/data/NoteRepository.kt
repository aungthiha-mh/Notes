package com.flexath.notes.data

import com.flexath.notes.data.room.NoteDao
import com.flexath.notes.data.room.NoteEntity

class NoteRepository(private val dao:NoteDao) {
    var getAllNotes = dao.getAllNotes()
    suspend fun insertNote(note:NoteEntity) = dao.insertNote(note)
    suspend fun updateNote(note:NoteEntity) = dao.updateNote(note)
    suspend fun deleteNote(note:NoteEntity) = dao.deleteNote(note)
}