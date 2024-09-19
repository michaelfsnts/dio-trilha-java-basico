package aparelho;

import apks.AparelhoTelefonico;
import apks.NavegadorInternet;
import apks.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
       System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }


    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }


    public void adicionarNovaPagina() {
       System.out.println("Adicionando nova página");
    }


    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }


    public void atender() {
        System.out.println("Atendendo");
    }


    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
    
}
