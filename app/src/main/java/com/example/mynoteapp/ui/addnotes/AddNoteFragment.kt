package com.example.mynoteapp.ui.addnotes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentAddNoteBinding

class AddNoteFragment:Fragment(R.layout.fragment_add_note) {
    private var binding:FragmentAddNoteBinding? = null
    private val viewModel:AddNoteViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddNoteBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}