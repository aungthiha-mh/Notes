package com.flexath.notes.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "note_table")
data class NoteEntity(
    @ColumnInfo(name = "title") var title:String,
    @ColumnInfo(name = "description") var description:String
):Serializable {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}


