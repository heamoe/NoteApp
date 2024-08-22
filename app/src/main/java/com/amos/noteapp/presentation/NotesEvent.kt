package com.amos.noteapp.presentation

import android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener
import com.amos.noteapp.data.Note

sealed interface NotesEvent {
    object SortNotes : NotesEvent

    data class DeleteNote(val note: Note) : NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ) : NotesEvent
}