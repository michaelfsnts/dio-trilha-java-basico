package app;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public FacebookMessenger() {
    }
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
