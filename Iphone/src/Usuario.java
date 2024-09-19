import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("REPRODUTOR MUSICAL\n");
        iphone.selecionarMusica("Planos");
        iphone.tocar();
        iphone.pausar();
        System.out.println("\nNAVEGADOR INTERNET\n");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();
        System.out.println("\nAPARELHO TELEFONICO\n");
        iphone.ligar("11 91234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
