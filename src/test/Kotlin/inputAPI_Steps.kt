import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import java.net.URL
import kotlin.test.expect

class inputAPI_Steps: Pt {

    val storage_manager = APIStorageManager()
    lateinit var lines: List<String>
    init {

        Dado("^que tenha acesso a um repositório de títulos de livros com a query de pesquisa 'Rodrigo' na url \"([^\"]*)\"$") { arg1: String ->
            val query = "Rodrigo"
            val url = "http://dblp.org/search/publ/api?q=${query}&format=json"
            val result = URL(url).readText()
            Assert.assertNotEquals(null, result)
//            throw PendingException()
        }

        Quando("^eu fizer a requisição para a API com a query 'Rodrigo'$") {
            val query = "Rodrigo"
            lines = storage_manager.read(query)
//            throw PendingException()
        }

        Entao("^devo ver uma quantidade não nula de títulos$") {
            Assert.assertNotEquals(null,lines)
//            throw PendingException()
        }


    }
}