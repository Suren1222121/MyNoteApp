package com.example.mynoteapp.ui.notes

import androidx.lifecycle.ViewModel
import com.example.mynoteapp.repo.GetAllNotesRepository

class NotesViewModel(
    private val getAllNotesRepository: GetAllNotesRepository
):ViewModel() {

}