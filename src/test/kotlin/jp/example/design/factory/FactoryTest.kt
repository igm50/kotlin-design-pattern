package jp.example.design.factory

import org.junit.platform.runner.JUnitPlatform
import org.junit.platform.suite.api.SelectPackages
import org.junit.platform.suite.api.SuiteDisplayName
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
@SuiteDisplayName("Factory-pattern test suite.")
@SelectPackages("jp.example.design.factory")
class FactoryTest
