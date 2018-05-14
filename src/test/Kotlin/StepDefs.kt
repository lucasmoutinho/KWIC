import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class StepDefs: Pt {

    val storage_manager = FileStorageManager()
    lateinit var lines: List<String>
    init {

        Dado("^que eu tenha um arquivo texto denominado \"([^\"]*)\" com (\\d+) linhas$") { arg1: String, arg2: Int ->
            File(arg1).printWriter().use { out ->
                out.write("TP2 é massa\nCade todo mundo?\nSumiu\nUm Gnomo, um Gnomo")
            }
            //throw PendingException()
        }

        Quando("^eu abrir este arquivo e ler os dados$") {
            lines = storage_manager.read("teste.txt")
            println(lines)
            //throw PendingException()
        }

        Entao("^a quantidade de linhas deve ser (\\d+)$") { arg1: Int ->
            Assert.assertEquals(arg1,storage_manager.length(lines))
            File("teste.txt").delete()
            //throw PendingException()
        }


    }
}