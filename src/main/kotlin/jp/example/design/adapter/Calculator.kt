package jp.example.design.adapter

abstract class Calculator {
    abstract fun flash(): Light
}

class Computer: Calculator() {
    private val lightBulb = LightBulb()

    override fun flash(): Light = lightBulb.flash()
}
