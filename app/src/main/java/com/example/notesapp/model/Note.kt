package com.example.notesapp.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Date

@Entity

data class Note(

    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    val title: String,
    val content: String,
    val date: String,
    val color: Int = -1,

) : Serializable
