package jp.example.design.factory

interface PencilFactory {
    fun create(): Pencil
}

object RedPencilFactory: PencilFactory {
    override fun create(): Pencil = RedPencil("H", "シンプル")
}

object BluePencilFactory: PencilFactory {
    override fun create(): Pencil = BluePencil("B", "柄")
}

