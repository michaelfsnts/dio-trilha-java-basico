package app;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando conexão à Internet");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagem");
    }

}
