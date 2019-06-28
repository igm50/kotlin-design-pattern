package jp.example.design.factory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RedPencilTest{
    @Test
    fun testWriting() {
        val a: Pencil = RedPencil("芯", "カバー")
        assertThat(a.write()).isEqualTo("芯：芯、カバー：カバー で赤い文字を書きます。")
    }
}

class BluePencilTest{
    @Test
    fun testWriting() {
        val a: Pencil = BluePencil("芯", "カバー")
        assertThat(a.write()).isEqualTo("芯：芯、カバー：カバー で青い文字を書きます。")
    }
}
