package jp.example.design.adapter

import org.junit.platform.runner.JUnitPlatform
import org.junit.platform.suite.api.SelectPackages
import org.junit.platform.suite.api.SuiteDisplayName
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
@SuiteDisplayName("Adapter-Pattern test suite.")
@SelectPackages("jp.example.design.adapter")
class AdapterTest
