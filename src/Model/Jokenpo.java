package Model;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    int escolhaUsuario;
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
        escolhaUsuario = leitor.nextInt();
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
        Random random = new Random();

        numeroAleatorio = random.nextInt(3) + 1;

        if (escolhaUsuario > 3 ){
            System.out.println("Escolha inválida, digite novamente!");
            obterDados();
        }

        if (escolhaUsuario == numeroAleatorio){

            resultado = "* * *  E M P A T O U  * * * ";

        }else if (escolhaUsuario == 1 && numeroAleatorio == 3
                || escolhaUsuario == 2 && numeroAleatorio == 1 ||
                    escolhaUsuario == 3 && numeroAleatorio == 2) {

            resultado = "* * *  V O C Ê  V E N C E U  * * * ";

        }else if (escolhaUsuario == 3 && numeroAleatorio == 1
                || escolhaUsuario == 1 && numeroAleatorio == 2 ||
                escolhaUsuario == 2 && numeroAleatorio == 3) {

            resultado = "* * *  V O C Ê  P E R D E U  * * * ";

        }

    }

    public void exibirResultado(){

        if (escolhaUsuario == 1){
            informeEscolha = "Pedra";

        } else if (escolhaUsuario == 2) {
            informeEscolha = "Papel";

        } else if (escolhaUsuario == 3) {
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
