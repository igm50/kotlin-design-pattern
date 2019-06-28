package jp.example.design.iterator

import java.util.*

interface Books{
    fun iterator() : BooksIterator
    fun add(book: Book)
}

class BookBox: Books {
    internal var books = ArrayList<Book>()

    override fun iterator(): BooksIterator = BookBoxIterator(this)
    override fun add(book: Book) {books.add(book)}
}

class BookShelf: Books {
    internal var firstLevel = ArrayList<Book>()
    internal var secondLevel = ArrayList<Book>()
    internal val MAX = 3

    override fun iterator(): BooksIterator = BookShelfIterator(this)

    override fun add(book: Book) {
        when {
            firstLevel.size < MAX -> firstLevel.add(book)
            secondLevel.size < MAX -> secondLevel.add(book)
            else -> System.out.println("This shelf is full!!")
        }
    }
}


