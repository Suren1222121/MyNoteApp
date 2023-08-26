package com.example.mynoteapp.repo

import com.example.mynoteapp.data.entity.Note
import kotlinx.coroutines.flow.Flow

interface GetAllNotesRepository {
    fun getAllNotes(): Flow<List<Note>>

}