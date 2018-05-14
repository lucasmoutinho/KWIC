import java.net.URL
import java.util.regex.Pattern

fun main(args: Array<String>) {

    val query = "Rodrigo"
    val url = "http://dblp.org/search/publ/api?q=${query}&format=json"
    val result = URL(url).readText()

    val p = Pattern.compile("\\d+")
    val m = p.matcher("ABcDEFG12345DiFKGLSG938SDsFSd")
    while (m.find())
    {
        println(m.group())
    }
    println(result)

}