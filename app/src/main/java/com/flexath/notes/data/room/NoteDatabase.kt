package com.flexath.notes.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NoteEntity::class], version = 1, exportSchema = true)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao:NoteDao

    companion object {
        @Volatile
        private var INSTANCE:NoteDatabase? = null

        fun getInstance(context: Context) = INSTANCE ?: synchronized(this){
            INSTANCE ?: Room.databaseBuilder(
                context.applicationContext,
                NoteDatabase::class.java,
                "NoteDatabase")
                .build().also {
                    INSTANCE = it
                }
        }
    }
}



