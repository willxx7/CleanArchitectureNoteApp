package com.example.cleanarchitecturenoteapp.notes

import com.example.cleanarchitecturenoteapp.domain.model.Note
import com.example.cleanarchitecturenoteapp.domain.util.NoteOrder
import com.example.cleanarchitecturenoteapp.domain.util.OrderType


data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
)


