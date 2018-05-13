import cucumber.api.PendingException
import cucumber.api.java8.Pt

class StepDefs: Pt {
    init {
        Dado("^que eu tenha um arquivo texto denominado \"([^\"]*)\"$") { arg1: String ->
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        Quando("^eu abrir este arquivo e ler os dados$") {
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        Entao("^a primera frase lida deve ser \"([^\"]*)\"$") { arg1: String ->
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }
    }
}