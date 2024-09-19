package app;

public class MSNMessenger extends ServicoMensagemInstantanea{

    public MSNMessenger() {
    }
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }
    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
