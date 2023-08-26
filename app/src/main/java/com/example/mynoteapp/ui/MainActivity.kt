package com.example.mynoteapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.ActivityMainBinding
import com.example.mynoteapp.ui.notes.NotesFragment

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater)
            .also { binding = it }
            .run{setContentView(root)}
        supportFragmentManager.commit {
            replace(R.id.container,NotesFragment.newInstance())
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}