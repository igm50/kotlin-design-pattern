package jp.example.design.adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LightTest {
    @Test
    fun testEquality() {
        val amount = 30

        assertThat(Light(amount) === Light(amount)).isFalse()
        assertThat(Light(amount) == Light(amount)).isTrue()
    }
}
