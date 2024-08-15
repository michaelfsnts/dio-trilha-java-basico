public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

       System.out.println("TV Ligada? " + smartTv.ligada); 
       System.out.println("Em qual canal? " + smartTv.canal);
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.ligar();
       System.out.println("NOVO STATUS -> TV Ligada? " + smartTv.ligada);

       smartTv.desligar();
       System.out.println("NOVO STATUS ->TV Ligada? " + smartTv.ligada);
    }
    
}
