package Model;

import java.util.Scanner;

public class Jokenpo {
    int escolha;
    int numeroAleatorio;
    String resultado;
    String informeEscolha;
    String informeEscolhaComputador;
    String escolhaNovamente;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

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

        System.out.print("\nDeseja jogar novamente (S/N)?");
        escolhaNovamente = leitor2.nextLine().toUpperCase();

        if (escolhaNovamente.equals("S")){
            obterDados();
        }else {
            System.out.println("Até Logo!");
        }

    }

    public void jogar(){

        numeroAleatorio = (int) (Math.random() * 4) + 1;

        if (escolha == numeroAleatorio){

            resultado = "* * *  E M P A T O U  * * * ";

        }else if (escolha == 1 && numeroAleatorio == 3
                || escolha == 2 && numeroAleatorio == 1 ||
                    escolha == 3 && numeroAleatorio == 2) {

            resultado = "* * *  V O C Ê  V E N C E U  * * * ";

        }else if (escolha == 3 && numeroAleatorio == 1
                || escolha == 1 && numeroAleatorio == 2 ||
                escolha == 2 && numeroAleatorio == 3) {

            resultado = "* * *  V O C Ê  P E R D E U  * * * ";

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
        System.out.println("O computador escolheu: " + informeEscolhaComputador + "\n");
        System.out.println(resultado);

    }

}
