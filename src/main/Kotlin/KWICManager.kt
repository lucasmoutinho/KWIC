class KWICManager {

    fun mkKWIC(frases: List<String>): List<String>{
        var i: Int
        var j: Int
        var frases_line: List<String>
        for(i in 0..frases.size){
            frases_line = frases[i].split(" ")
            for(j in 0..frases_line.size){
                Shifter.shift(frases_line,j,j)
            }
        }
    }
}