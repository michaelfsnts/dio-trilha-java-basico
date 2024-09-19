import app.FacebookMessenger;
import app.MSNMessenger;
import app.Telegram;

public class Computador {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        FacebookMessenger fcb = new FacebookMessenger();
        Telegram tlg = new Telegram();

        msn.enviarMensagem();
        msn.receberMensagem();
        
        fcb.enviarMensagem();
        fcb.receberMensagem();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
