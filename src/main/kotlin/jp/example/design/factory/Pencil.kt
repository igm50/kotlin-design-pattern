package jp.example.design.factory

abstract class Pencil(private val core: String, private val cover: String) {
    fun write(): String = "芯：$core、カバー：$cover で${color()}文字を書きます。"

    protected abstract fun color(): String
}

class RedPencil(core: String, cover: String): Pencil(core, cover) {
    override fun color(): String = "赤い"
}

class BluePencil(core: String, cover: String): Pencil(core, cover) {
    override fun color(): String = "青い"
}
