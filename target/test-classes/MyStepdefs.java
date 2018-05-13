import cucumber.api.PendingException;
import cucumber.api.java8.Pt;

public class MyStepdefs implements Pt {
    public MyStepdefs() {
        Dado("^que eu tenha um arquivo texto denominado \"([^\"]*)\"$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
