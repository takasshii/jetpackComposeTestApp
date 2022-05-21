package com.example.jetpackcomposetestapp

val items = listOf<Book>(
    Book("Muscle", R.drawable.e8926ae7b2d4641da19aae39ccbf460d, "Alan Trotter"),
    Book("Dominicana", R.drawable.e8926ae7b2d4641da19aae39ccbf460d, "Angie Cruz"),
    Book("A New Program for Graphic Design", R.drawable.e8926ae7b2d4641da19aae39ccbf460d, "David Reinfurt"),
)

data class Book(
    val title: String,
    val image: Int,
    val author: String
)

val myBookItems = listOf(
    MyBook(Book("Just My Type", R.drawable.e8926ae7b2d4641da19aae39ccbf460d, "Simon Garfield"), "25.03.2022", 75f),
    MyBook(items[0], "25.02.2022", 80f),
    MyBook(items[1], "21.01.2022", 90f),
)

data class MyBook(
    val book: Book,
    val returnDate: String,
    val timeLeftPercentage: Float
)