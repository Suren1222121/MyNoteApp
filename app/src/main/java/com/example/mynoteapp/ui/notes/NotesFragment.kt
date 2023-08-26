package com.example.mynoteapp.ui.notes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentNotesBinding

class NotesFragment:Fragment(R.layout.fragment_notes) {
    private var binding:FragmentNotesBinding? = null
    private val viewModel:NotesViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotesBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object
    {
        fun newInstance() = NotesFragment()
    }

}