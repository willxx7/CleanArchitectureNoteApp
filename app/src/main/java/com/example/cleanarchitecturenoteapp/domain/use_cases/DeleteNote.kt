package com.example.cleanarchitecturenoteapp.domain.use_cases

import com.example.cleanarchitecturenoteapp.domain.model.Note
import com.example.cleanarchitecturenoteapp.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository,
) {

    suspend operator fun invoke(note: Note) {
        return repository.deleteNote(note)
    }

}