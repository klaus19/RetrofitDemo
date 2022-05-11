package com.example.retrofitdemo

data class Results(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<QuoteList>,
    val totalCount: Int,
    val totalPages: Int
)