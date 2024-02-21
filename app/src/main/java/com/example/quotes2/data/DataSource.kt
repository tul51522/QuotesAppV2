package com.example.quotes2.data

import com.example.quotes2.R
import com.example.quotes2.model.Quote

class DataSource {
    fun loadQuotes(): List<Quote>{
        return listOf<Quote>(
            Quote(R.string.quotes1, R.string.author1, R.drawable.image1),
            Quote(R.string.quotes2, R.string.author2, R.drawable.image2),
            Quote(R.string.quotes3, R.string.author3, R.drawable.image3),
            Quote(R.string.quotes4, R.string.author4, R.drawable.image4),
            Quote(R.string.quotes5, R.string.author5, R.drawable.image5),
            Quote(R.string.quotes6, R.string.author6, R.drawable.image6),
            Quote(R.string.quotes7, R.string.author7, R.drawable.image7),
            Quote(R.string.quotes8, R.string.author8, R.drawable.image8),
            Quote(R.string.quotes9, R.string.author9, R.drawable.image9),
            Quote(R.string.quotes10, R.string.author10, R.drawable.image10)

        )
    }
}