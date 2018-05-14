import cucumber.api.PendingException
import cucumber.api.java8.Pt
import org.junit.Assert
import java.io.File
import kotlin.test.expect

class shiftWordSteps:Pt {
    lateinit var frases: List<String>
    lateinit var frase_final: String
    init {
        Dado("^que eu tenha as frases \"([^\"]*)\"$") { arg1: String ->
            frases = arg1.split(' ')
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }

        Quando("^eu usar a função de circular a frase \"([^\"]*)\"$") { arg1: String ->
            frase_final = Shifter.shift(frases,2,2).joinToString(" ")
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }

        Entao("^eu devo ver a frase circulada corretamente \"([^\"]*)\"$") { arg1: String ->
            Assert.assertEquals(arg1,frase_final)
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }
    }
}