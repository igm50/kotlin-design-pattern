package jp.example.design.adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LightBulbTest {
    @Test
    fun testFlashing() {
        val lightBulb = LightBulb()

        assertThat(lightBulb.flash() == Light(30)).isTrue()
    }
}
