package jp.example.design.iterator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BooksTest {
    private fun bookA() = Book("人間失格", "太宰治")
    private fun bookB() = Book("吾輩は猫である", "夏目漱石")
    private fun bookC() = Book("羅生門", "芥川龍之介")
    private fun bookD() = Book("怪人二十面相", "江戸川乱歩")
    private fun bookE() = Book("たけくらべ", "樋口一葉")

    @Test
    fun testEquality() {
        assertThat(bookA() === bookA()).isFalse()

        assertThat(bookA() == bookA()).isTrue()
        assertThat(bookA() == bookB()).isFalse()
    }

    @Test
    fun testBoxIterator() {
        testBooksIterator(BookBox())
    }

    @Test
    fun testShelfIterator() {
        testBooksIterator(BookShelf())
    }

    private fun testBooksIterator(books: Books) {
        books.add(bookA())
        books.add(bookB())
        books.add(bookC())
        books.add(bookD())
        books.add(bookE())

        val iterator = books.iterator()

        assertThat(iterator.hasNext()).isTrue()
        assertThat(iterator.next()).isEqualTo(bookA())

        assertThat(iterator.hasNext()).isTrue()
        assertThat(iterator.next()).isEqualTo(bookB())

        assertThat(iterator.hasNext()).isTrue()
        assertThat(iterator.next()).isEqualTo(bookC())

        assertThat(iterator.hasNext()).isTrue()
        assertThat(iterator.next()).isEqualTo(bookD())

        assertThat(iterator.hasNext()).isTrue()
        assertThat(iterator.next()).isEqualTo(bookE())

        assertThat(iterator.hasNext()).isFalse()
    }
}
