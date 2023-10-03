object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length == rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        /*
            zip method combine both Strings, creating a pair of sequence

            leftStrand: 'GGACGGATTCTG'
            rightStrand: 'AGGACGGATTCT'

            [('G', 'A')('G', 'G')('A','G') ... ]
         */
        return leftStrand.zip(rightStrand).count { it.first != it.second }
    }
}
