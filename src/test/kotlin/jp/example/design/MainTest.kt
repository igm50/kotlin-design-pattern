package jp.example.design

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.junit.platform.runner.JUnitPlatform
import org.junit.platform.suite.api.SelectPackages
import org.junit.platform.suite.api.SuiteDisplayName
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
@SuiteDisplayName("All test suite.")
@SelectPackages("jp.example.design")
class MainTest
