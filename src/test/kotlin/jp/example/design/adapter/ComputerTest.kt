package jp.example.design.adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ComputerTest {
    @Test
    fun testFlashing() {
        val computer: Calculator = Computer()

        assertThat(computer.flash() == Light(30)).isTrue()
    }
}
