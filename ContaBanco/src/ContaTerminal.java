import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       Scanner entrada = new Scanner(System.in);
       System.out.print("Por favor insira o número da conta:");
       int numero = entrada.nextInt();
       //
       System.out.printf("Por favor insira o número da Agência:");
       String agencia = entrada.next(); 
       //
       System.out.printf("Digite o seu nome: ");
       String nomeCliente = entrada.next();
       //
       System.out.print("Digite seu saldo: ");
       double saldo = entrada.nextDouble();

       System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque.");

       entrada.close();
    }
}
