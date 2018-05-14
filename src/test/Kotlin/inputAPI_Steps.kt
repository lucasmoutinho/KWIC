import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class inputAPI_Steps: Pt {

    val storage_manager = FileStorageManager()
    lateinit var lines: List<String>
    init {

        Dado("^que tenha acesso a um repositório de títulos de livros com a query de pesquisa 'Rodrigo' na url \"([^\"]*)\"$") { arg1: String ->

            throw PendingException()
        }

        Quando("^eu fizer a requisição para a API com a query 'Rodrigo'$") {
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        Entao("^devo ver uma quantidade não nula de títulos$") {
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }


    }
}