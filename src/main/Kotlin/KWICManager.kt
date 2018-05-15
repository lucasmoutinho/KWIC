class KWICManager {

    fun mkKWIC(frases: List<String>,stop_words: List<String>): List<String>{
        val return_frases: MutableList<String> = mutableListOf()

        var frases_line: List<String>
        for(i in 0..frases.size-1){
            frases_line = frases[i].split(" ")
            for(j in 0..frases_line.size-1){
                if(stop_words.contains(frases_line[j].toLowerCase())){

                }else{
                    return_frases.add(Shifter.shift(frases_line,j,j).joinToString(" ").capitalize())
                }
            }
        }

        return this.alphabetical(return_frases)
    }

    fun alphabetical(frases: MutableList<String>): List<String> {
        for (i in frases.size downTo 1) {
            for (j in 1 until i) {
                if (frases[j - 1][0].toLowerCase() > frases[j][0].toLowerCase()) {
                    val aux = frases[j]
                    frases[j] = frases[j - 1]
                    frases[j - 1] = aux
                }
            }
        }

        return frases
    }
}