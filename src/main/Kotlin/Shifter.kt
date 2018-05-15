object Shifter {
    fun shift(frases: List<String>, position: Int, target: Int): List<String> {
        val left: MutableList<String> = mutableListOf()
        val right: MutableList<String> = mutableListOf()
        var return_list: MutableList<String> = mutableListOf()

        var i = 0

        for(i in 0..(position-1)){
            right.add(frases[i])
        }
        for(i in (position+1)..(frases.size-1)){
            left.add(frases[i])
        }

//        if(left.joinToString(" ").length < (target -5)) {
//            return shiftRight(left, right, target)
//        }
        //return shiftLeft(left, right, target)
        return_list = left.union(right).toMutableList()
        return_list.add(0,frases[target])
        return return_list
    }

}