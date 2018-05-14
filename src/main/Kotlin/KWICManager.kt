class KWICManager {

    fun mkKWIC(frases: List<String>,stop_words: List<String>): List<String>{
        var return_frases: MutableList<String> = mutableListOf()
        var i: Int
        var j: Int
        var frases_line: List<String>
        for(i in 0..frases.size-1){
            frases_line = frases[i].split(" ")
            for(j in 0..frases_line.size-1){
                if(stop_words.contains(frases_line[j])){

                }else{
                    return_frases.add(Shifter.shift(frases_line,j,j).joinToString(" "))
                }
            }
        }

        return this.alphabetical(return_frases)
    }

    fun alphabetical(frases: List<String>): List<String> {
        frases.sorted()
        return frases.sorted()
    }
}