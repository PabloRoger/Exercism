class Matrix(private val matrixAsString: String) {
    val hola = "hola"
    fun createList(): List<List<Int>> {
        val row: List<String> = matrixAsString.split("\n")
        val maze = row.map { row ->
            row.split(Regex("\\s+")).map { it.toInt() }
        }.toList()

        return maze
    }

    fun column(colNr: Int): List<Int> {
        val listNumber = createList()
        val newList: List<Int>
        TODO("logic development")
    }

    fun row(rowNr: Int): List<Int> {
        TODO("Implement this to complete the task")
    }
}
