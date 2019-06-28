package jp.example.design.composite

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.platform.runner.JUnitPlatform
import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.SuiteDisplayName
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
@SuiteDisplayName("Names test suit.")
@SelectClasses(FileTest::class, DirectoryTest::class)
class FileSystemTest

class FileTest {
    @Test
    fun testSize() {
        val fileA = File(30)
        assertThat(fileA.size()).isEqualTo(30)

        val fileB = File(50)
        assertThat(fileB.size()).isEqualTo(50)

        val fileC = File(-50)
        assertThat(fileC.size()).isEqualTo(0)
    }
}

class DirectoryTest() {
    @Test
    fun testSize() {
        val dirA = Directory()
        assertThat(dirA.size()).isEqualTo(0)

        dirA.add(File(30))
        assertThat(dirA.size()).isEqualTo(30)

        val list = ArrayList<FileSystem>()
        list.add(dirA)
        list.add(File(50))

        val dirB = Directory(list)
        assertThat(dirB.size()).isEqualTo(80)
    }
}
