package Model;

import java.util.Scanner;

public class Jokenpo {
    int escolha;
    int numeroAleatorio = (int) (Math.random() * 4);
    String resultado;
    String informeEscolha;
    String informeEscolhaComputador;
    String escolhaNovamente;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("*** Vamos jogar Jokenpô! ***");
        System.out.println("--------------------------------------");
        System.out.println("Escolha uma opção: ");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("--------------------------------------");
        System.out.print("Digite sua escolha: ");
        escolha = leitor.nextInt();
        jogar();
        exibirResultado();

    }

    public void jogar(){

        if (numeroAleatorio == 0){

            numeroAleatorio = (int) (Math.random() * 4);
        }

        if (escolha == 1 && numeroAleatorio == 1){

            resultado = "* * *  E M P A T O U  * * * ";

        }

    }

    public void exibirResultado(){

        if (escolha == 1){
            informeEscolha = "Pedra";

        } else if (escolha == 2) {
            informeEscolha = "Papel";

        } else if (escolha == 3) {
            informeEscolha = "Tesoura";

        }

        if (numeroAleatorio == 1){
            informeEscolhaComputador = "Pedra";

        } else if (numeroAleatorio == 2) {
            informeEscolhaComputador = "Papel";

        } else if (numeroAleatorio == 3) {
            informeEscolhaComputador = "Tesoura";

        }


        System.out.println("Você escolheu: " + informeEscolha);
        System.out.println("O computador escolheu: " + informeEscolhaComputador);
        System.out.println(resultado);

    }
}
