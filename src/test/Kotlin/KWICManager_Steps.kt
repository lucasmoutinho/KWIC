import cucumber.api.java.pt.Entao
import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class KWICManager_Steps:Pt {

    val storage_manager = FileStorageManager()

    lateinit var lines: List<String>
    lateinit var stop_words: List<String>
    init{
        Dado("^um arquivo de stop_words \"([^\"]*)\"$") { arg1: String ->
            File(arg1).printWriter().use { out ->
                out.write("de\njá\npor\nser")
            }
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }

        Quando("^eu abrir este arquivo e ler os dados e requisitar o KWIC destes dados$") {
            stop_words = storage_manager.read("stop_words.txt")
            lines = storage_manager.read("teste.txt")
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }

        Entao("^eu devo ter como saída uma lista alfabética de todas as linhas do arquivo original em KWIC$", {
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        })
    }
}