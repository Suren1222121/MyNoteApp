package com.example.mynoteapp.repo

import com.example.mynoteapp.data.entity.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    suspend fun insertOrUpdateNote(note:Note)

    suspend fun deleteNote(note: Note)

    suspend fun getNote(id: Int):Note?

}