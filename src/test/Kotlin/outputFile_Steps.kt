import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class outputFile_Steps: Pt {

    val output = FileOutputManager()
    lateinit var lines: List<String>
    init {

        Dado("^que eu tenha uma lista com (\\d+) linhas$") { arg1:Int ->
            lines = listOf("Gnomo", "Um Gnomo", "Um Soneca", "Nicholas")
            Assert.assertEquals(arg1,lines.size)
//            throw PendingException()
        }

        Quando("^eu requisitar a escrita destas linhas em um arquivo$") {
            output.write(lines)
//            throw PendingException()
        }
        Entao("^a quantidade de linhas na \"([^\"]*)\" deve ser (\\d+)$") { arg1: String, arg2: Int ->
            Assert.assertEquals(true, File(arg1).isFile)
            Assert.assertEquals(arg2, File(arg1).readLines().size)
//            throw PendingException()
        }

    }
}