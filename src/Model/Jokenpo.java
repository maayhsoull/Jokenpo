package Model;

import java.util.Scanner;

public class Jokenpo {
    int escolha;
    int numeroAleatorio = (int) (Math.random() * 4);

    public void testandoRandom(){
        System.out.println(numeroAleatorio);
    }

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("--------------------------------------");
        System.out.print("*** Vamos jogar Jokenpô! ***");
        System.out.print("--------------------------------------");
        System.out.println("Escolha uma opção: ");
        System.out.print("(1) Pedra");
        System.out.print("(2) Papel");
        System.out.print("(3) Tesoura");
        System.out.print("--------------------------------------");
        System.out.print("Digite sua escolha: ");
        escolha = leitor.nextInt();

    }

    public void jogar(){

    }
}
