package jp.example.design.template_method

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.platform.runner.JUnitPlatform
import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.SuiteDisplayName
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
@SuiteDisplayName("Names test suit.")
@SelectClasses(JapaneseNameTest::class, AmericanNameTest::class)
class NameTest

class JapaneseNameTest {
    @Test
    fun testFullName() {
        val name: Name = JapaneseName("太郎", "山田")
        assertThat(name.fullName()).isEqualTo("山田 太郎")
    }
}

class AmericanNameTest {
    @Test
    fun testFullName() {
        val name: Name = AmericanName("John", "Smith")
        assertThat(name.fullName()).isEqualTo("John Smith")
    }
}