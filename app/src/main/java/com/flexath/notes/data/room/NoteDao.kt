package com.flexath.notes.data.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note:NoteEntity)
    
    @Delete
    suspend fun deleteNote(note:NoteEntity)
    
    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNote(note:NoteEntity)
    
    @Query("SELECT * FROM note_table ORDER BY id ASC")
    fun getAllNotes() : LiveData<List<NoteEntity>>
}



