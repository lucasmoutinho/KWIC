import java.net.URL

class APIStorageManager: StorageManager {

    private lateinit var lines: List<String>

    private fun findTitles(json: String){
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
        this.lines = stringList
    }

    fun getLines(): List<String> {
        return this.lines
    }

    override fun read(query: String): List<String> {
        val url = "http://dblp.org/search/publ/api?q=${query}&format=json"
        val result = URL(url).readText()
        findTitles(result)
        return this.lines
    }

    override fun length(file_list: List<String>): Int {
        return file_list.size
    }
}