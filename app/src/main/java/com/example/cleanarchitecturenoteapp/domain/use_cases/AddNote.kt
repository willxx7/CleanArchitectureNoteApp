package com.example.cleanarchitecturenoteapp.domain.use_cases

import com.example.cleanarchitecturenoteapp.domain.model.InvalidNoteException
import com.example.cleanarchitecturenoteapp.domain.model.Note
import com.example.cleanarchitecturenoteapp.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository,
) {


    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {

        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }


}

