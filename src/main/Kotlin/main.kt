import java.net.URL

fun findTitles(json: String): MutableList<String>{
    var stringAux = ""
    var stringList: MutableList<String> = mutableListOf()
    var i = 0
    while(i < (json.length - 5)){
        if((json[i] == 't') and (json[i+1] == 'i') and (json[i+2] == 't') and (json[i+3] == 'l') and (json[i+4] == 'e')){
            i += 8
            while(json[i] != '"'){
                stringAux += json[i]
                i++
            }
            stringList.add(stringAux)
            stringAux = ""
            i++
        }
        i++
    }
    return stringList
}

fun main(args: Array<String>) {
    val query = "Rodrigo"
    val url = "http://dblp.org/search/publ/api?q=${query}&format=json"
    val result = URL(url).readText()
    val stringList: List<String> = findTitles(result)

    val terminal = TerminalOutputManager()
    terminal.write(stringList)
}