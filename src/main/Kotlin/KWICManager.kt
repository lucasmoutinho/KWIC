class KWICManager {

    fun mkKWIC(frases: List<String>): List<String>{
        var return_frases: MutableList<String> = mutableListOf()
        var i: Int
        var j: Int
        var frases_line: List<String>
        for(i in 0..frases.size){
            frases_line = frases[i].split(" ")
            for(j in 0..frases_line.size){
                return_frases.add(Shifter.shift(frases_line,j,j).joinToString(" "))
            }
        }

        return return_frases
    }
}