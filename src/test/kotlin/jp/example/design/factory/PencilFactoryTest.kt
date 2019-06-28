package jp.example.design.factory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RedPencilFactoryTest {
    @Test
    fun testUniqueness() {
        assertThat(RedPencilFactory === RedPencilFactory).isTrue()
    }

    @Test
    fun testCreate() {
        val factory: PencilFactory = RedPencilFactory
        val pencil: Pencil = factory.create()

        assertThat(pencil.write()).contains("赤")
        assertThat(pencil.write()).isEqualTo(RedPencil("H", "シンプル").write())
    }
}

class BluePencilFactoryTest {
    @Test
    fun testUniqueness() {
        assertThat(BluePencilFactory === BluePencilFactory).isTrue()
    }

    @Test
    fun testCreate() {
        val factory: PencilFactory = BluePencilFactory
        val pencil: Pencil = factory.create()

        assertThat(pencil.write()).contains("青")
        assertThat(pencil.write()).isEqualTo(BluePencil("B", "柄").write())
    }
}
