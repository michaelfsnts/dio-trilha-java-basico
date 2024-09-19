import app.FacebookMessenger;
import app.MSNMessenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;

public class ComputadorDois {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
