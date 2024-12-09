package academy.devdojo.maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = keyboard.nextLine();
        System.out.println("Digite sua idade");
        int idade = keyboard.nextInt();
        System.out.println("Digite M ou F para sexo");
        char sexo = keyboard.next().charAt(0);

        System.out.println("-------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);

    }
}
