import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //desafio.
       try {
          Scanner entrada = new Scanner(System.in);
          System.out.print("Por favor insira o número da conta:");
          int numero = entrada.nextInt();
          //
          System.out.println("Por favor insira o número da Agência:");
          String agencia = entrada.next();
          //
          System.out.println("Digite o seu nome: ");
          String nomeCliente = entrada.next();
          //
          System.out.println("Digite seu saldo: ");
          double saldo = entrada.nextDouble();

       System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque.");

       entrada.close();
       }catch (InputMismatchException e){
          System.out.println("Os campos não foram preenchidos corretamente.");
       }
    }
}
