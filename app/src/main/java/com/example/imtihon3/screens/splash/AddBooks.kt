package com.example.imtihon3.screens.splash

import android.content.Context
import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.database.Book

fun AddBooks(context: Context) {
    val books = listOf(
        Book(
            name = "Kitob 1",
            author = "Author 1",
            description = "Description 1 description description description description description description description description.",
            image = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1349126636i/8738280.jpg"
        ),
        Book(
            name = "Kitob 2",
            author = "Author 2",
            description = "Description 2 description description description description description description description description.",
            image = "https://m.media-amazon.com/images/I/61-6MEz7GhL._AC_UF1000,1000_QL80_.jpg"
        ),
        Book(
            name = "Kitob 3",
            author = "Author 3",
            description = "Description 3 description description description description description description description description.",
            image = "https://kitoblardunyosi.uz/image/cache/catalog/badiiy_adabiyot/xamsa-web-500x750.jpg"
        ),
        Book(
            name = "Kitob 4",
            author = "Author 4",
            description = "Description 4 description description description description description description description description.",
            image = "https://upload.wikimedia.org/wikipedia/commons/7/72/Animal_Farm_%28uzbek_edition%29.jpg"
        ),
        Book(
            name = "Kitob 5",
            author = "Author 5",
            description = "Description 5 description description description description description description description description.",
            image = "https://i.ebayimg.com/images/g/u6wAAOSwwX1hN7xf/s-l400.jpg"
        ),
        Book(
            name = "Kitob 6",
            author = "Author 6",
            description = "Description 6 description description description description description description description description.",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIZyFOuOJHHo3JKkLSU0qwrpz9zzyBF5jQnQ&s"
        ),
        Book(
            name = "Kitob 7",
            author = "Author 7",
            description = "Description 7 description description description description description description description description.",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpjfnsxo_U9qefIvLW2mhmCUuPYAAbQn4ofw&s"
        ),
        Book(
            name = "Kitob 8",
            author = "Author 8",
            description = "Description 8 description description description description description description description description.",
            image = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1628900363i/36322874.jpg"
        ),
    )
    val dao = AppDatabase.getInstance(context).getBookDao()
    books.forEach {
        dao.insertBook(it)
    }
}