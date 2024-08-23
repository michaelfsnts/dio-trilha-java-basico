public class ExemploBreakContinue {
    public static void main(String[] args) {

        //Break vai até o determinado indice e encerra a instrução.
        for(int numero = 1; numero<= 5; numero++){
            if(numero== 3)
                break;
            System.out.println(numero);
        }
        //Continue vai até o determinado indice desconsidera-o e continua até o fim da instrução.
        for(int numero = 1; numero<= 5; numero++){
            if(numero== 3)
                continue;
            System.out.println(numero);
        }
    }
}
