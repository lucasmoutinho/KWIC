import cucumber.api.java.pt.Entao
import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class KWICManager_Steps:Pt {

    val storage_manager = FileStorageManager()
    val kwic_manager = KWICManager()

    lateinit var lines: List<String>
    lateinit var stop_words: List<String>
    lateinit var frases: List<String>
    init{

        Dado("^que eu tenha um arquivo texto denominado \"([^\"]*)\" com (\\d+) linhas com as frases$") { arg1: String, arg2: Int ->
            File(arg1).printWriter().use { out ->
                out.write("Empresa Junior de Alto Crescimento\nSer uma empresa de TI referência\nVocê já mandou bem hoje\n")
            }

        }
        Dado("^um arquivo de stop_words \"([^\"]*)\"$") { arg1: String ->
            File(arg1).printWriter().use { out ->
                out.write("de\njá\npor\nser")
            }

        }

        Quando("^eu abrir este arquivo e ler os dados e requisitar o KWIC destes dados$") {
            stop_words = storage_manager.read("stop_words.txt")
            lines = storage_manager.read("teste.txt")
            frases = kwic_manager.mkKWIC(lines,stop_words)

        }

        Entao("^eu devo ter como saída uma lista alfabética de todas as linhas do arquivo original em KWIC$", {
            Assert.assertEquals("Empresa Junior de Alto Crescimento",frases[0])
            Assert.assertEquals("Junior de Alto Crescimento Empresa",frases[1])
            Assert.assertEquals("Alto Crescimento Empresa Junior de",frases[2])
            Assert.assertEquals("Crescimento Empresa Junior de Alto",frases[3])

        })
    }
}