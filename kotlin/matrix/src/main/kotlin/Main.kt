fun main() {
    val matrix = Matrix(
        """
            89 1903   3
            18    3   1
             9    4 800
        """.replace(Regex(" +"), " ").trimIndent(),
    )

    matrix.createList()
}
