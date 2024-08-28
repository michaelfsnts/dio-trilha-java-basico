package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        //selecaoCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"MARIA", "JOÃO","FELIPE", "CARLOS", "BRUNO"};
        for(String candidato : candidatos){
            ligarCandidato(candidato);
        }
    }

    static void ligarCandidato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }

        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos o contato com " + candidato + " na " + tentativasRealizadas+ " tentativa");
        else
            System.out.println("Não conseguimos o contato com " + candidato + " número máximo de tentativa " + tentativasRealizadas + " realizadas." );
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"MARIA", "JOÃO","FELIPE", "CARLOS", "BRUNO"};
        System.out.println("Imprimindo a lista de candidatos conforme o índice do elemento.");
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de índice Nº " + (i+1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada");
        //com for each.
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos  = {"MARIA", "JOÃO","FELIPE", "CARLOS", "BRUNO", "LUCAS", "GABRIEL", "ANTONIO", "FABRÍCIO", "ANDRÉ"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        int candidatoAtual = 0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado.");
            }else {
                System.out.println("O candidato " + candidato + " não foi selecionado.");
            }
            candidatoAtual++;
        }
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato".toUpperCase());
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato para contra proposta".toUpperCase());
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos".toUpperCase());
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}