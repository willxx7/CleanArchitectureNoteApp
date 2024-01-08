package com.example.cleanarchitecturenoteapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.example.cleanarchitecturenoteapp.ui.theme.LightGreen
import com.example.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.example.cleanarchitecturenoteapp.ui.theme.RedPink
import com.example.cleanarchitecturenoteapp.ui.theme.Violet


@Entity(tableName = "notes")
data class Note(
    @PrimaryKey
    val id: Int?,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color:Int
){

    companion object{

        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

