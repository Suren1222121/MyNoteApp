package com.example.mynoteapp.repo

import com.example.mynoteapp.data.db.NotesDao
import com.example.mynoteapp.data.entity.Note
import kotlinx.coroutines.flow.Flow

class GetAllNotesRepositoryImpl(
    private val notesDao: NotesDao

):GetAllNotesRepository {


    override fun getAllNotes(): Flow<List<Note>> =
        notesDao.getAllNotes()

}