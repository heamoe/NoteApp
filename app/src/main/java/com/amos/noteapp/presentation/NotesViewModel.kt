package com.amos.noteapp.presentation

import androidx.lifecycle.ViewModel
import com.amos.noteapp.data.NoteDao

class NotesViewModel(
    private val dao: NoteDao
) : ViewModel() {

}