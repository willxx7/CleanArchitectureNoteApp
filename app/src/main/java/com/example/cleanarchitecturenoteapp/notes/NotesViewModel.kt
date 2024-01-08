package com.example.cleanarchitecturenoteapp.notes


import androidx.lifecycle.ViewModel
import com.example.cleanarchitecturenoteapp.domain.use_cases.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel(){

}