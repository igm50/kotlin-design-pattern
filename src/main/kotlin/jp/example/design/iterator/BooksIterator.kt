package jp.example.design.iterator

interface BooksIterator {
    fun hasNext(): Boolean
    fun next(): Book
}

class BookBoxIterator(bookBox: BookBox): BooksIterator {
    private val iterator: Iterator<Book>
    init {
        iterator = bookBox.books.iterator()
    }

    override fun hasNext(): Boolean = iterator.hasNext()
    override fun next(): Book = iterator.next()
}

class BookShelfIterator(private val bookShelf: BookShelf): BooksIterator {
    private var count = 0

    override fun hasNext(): Boolean {
        val sum = bookShelf.firstLevel.size + bookShelf.secondLevel.size
        return count < sum
    }

    override fun next(): Book {
        return when {
            ++count <= bookShelf.MAX -> bookShelf.firstLevel[count - 1]
            else -> bookShelf.secondLevel[count - bookShelf.MAX - 1]
        }
    }
}
