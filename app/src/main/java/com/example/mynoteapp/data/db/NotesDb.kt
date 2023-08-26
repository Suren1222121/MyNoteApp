package com.example.mynoteapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mynoteapp.data.entity.Note

@Database(
    entities = [Note::class],
    version = 1,
)
abstract class NotesDb:RoomDatabase() {
    abstract fun getNotesDao(): NotesDao

    companion object{
        fun getNotesDb(context:Context) = Room.databaseBuilder(
            context, NotesDb::class.java, "notes"
        ).fallbackToDestructiveMigration().build()
    }
}