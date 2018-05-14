import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class StepDefs: Pt {

    val storage_manager = FileStorageManager()
    lateinit var lines: List<String>
    init {

        Dado("^que eu tenha um arquivo texto denominado \"([^\"]*)\"$") { arg1: String ->
            storage_manager.write(arg1)
            //println(arg1)
            //throw PendingException()
        }

        Quando("^eu abrir este arquivo e ler os dados$") {
            lines = storage_manager.read("teste.txt")
            println(lines)
            //throw PendingException()
        }

        Entao("^a primera frase lida deve ser \"([^\"]*)\"$") { arg1: String ->
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(arg1,lines[0])
            Assert.assertEquals("Bonifácil é massa!",lines[1])
            //throw PendingException()
        }
    }
}