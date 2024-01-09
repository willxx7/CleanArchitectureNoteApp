package com.example.cleanarchitecturenoteapp.domain.use_cases

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote

)