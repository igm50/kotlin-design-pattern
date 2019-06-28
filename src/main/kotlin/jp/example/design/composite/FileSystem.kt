package jp.example.design.composite

abstract class FileSystem {
    abstract fun size(): Long
}

class File(size: Long) : FileSystem() {
    private val size: Long = if (size > 0) size else 0

    override fun size(): Long = size
}

class Directory(private val files: ArrayList<FileSystem>) : FileSystem() {
    constructor() : this(ArrayList<FileSystem>())

    override fun size(): Long {
        return if (files.isEmpty()) 0
        else files.map { fileSystem -> fileSystem.size() }.sum()
    }

    fun add(fileSystem: FileSystem) = files.add(fileSystem)
}
