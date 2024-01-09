package com.example.cleanarchitecturenoteapp.notes

import com.example.cleanarchitecturenoteapp.domain.model.Note
import com.example.cleanarchitecturenoteapp.domain.util.NoteOrder

sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSelection : NotesEvent()

}
