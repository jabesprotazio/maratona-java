package atividade_Ricardo;

import java.io.IOException;
import java.util.Scanner;

public class AgainstCovid {

    public static String decompor(int numero) {
        if (numero <= 1) {
            return numero + " não pode ser decomposto em uma potência significativa.";
        }

        // Testar todas as bases possíveis (de 2 até o número / 2)
        for (int base = 2; base <= numero / 2; base++) {
            int expoente = 0;
            int valorAtual = 1;

            // Multiplicar a base até que o valor seja maior ou igual ao número
            while (valorAtual < numero) {
                valorAtual *= base;
                expoente++;
            }

            // Se encontramos um valor que iguala o número, retornamos a base e o expoente
            if (valorAtual == numero) {
                return numero + " pode ser decomposto como " + base + "^" + expoente + "\n " +
                        "Logo o tempo estimado para tal número de infectado é de " + expoente + " dias.";
            }
        }

        // Se não encontrar uma decomposição exata
        return numero + " não pode ser decomposto como uma potência de qualquer base.";
    }

    public static void main(String[] args) {
        int choice, infecteds;
        do {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Bem vindo ao AgainstCOVID!");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Estimar quantidade de infectados. ");
            System.out.println("2 - Estimar tempo para número X de infectados.");
            System.out.println("3 - Sair.");
            choice = keyboard.nextInt();

            if(choice == 2) {
                System.out.printf("");
                System.out.print("Atenção! Informe um número que possa ser decomposto em base igual à b(fator de crescimento)! \n" +
                        "Número de infectados = ");
                infecteds = keyboard.nextInt();

                System.out.println(decompor(infecteds)); // Exemplo de saída: 81 pode ser decomposto como 3^4


            } else if (choice == 1 ) {
                int Xstart, b,allInfects = 0,days;
                System.out.print("Informe a quantidade de pessoas inicialmente infectadas: ");
                Xstart = keyboard.nextInt();
                System.out.print("O número de pessoas infectadas por cada pessoa doente: ");
                b = keyboard.nextInt();
                System.out.print("Informe a quantidade de dias que deseja saber: ");
                days = keyboard.nextInt();


                for(int count = 1; count <= b; count++){
                    allInfects = (int)(Xstart * Math.pow(b,days));
                }

                System.out.println("\nA quantidade aproximada de pessoas infectadas em " + days + " dias é de " + allInfects);
                keyboard.nextLine();

            }

        }while (choice != 3);

        System.out.println("Até mais! Use máscara e fique em casa!");
    }
}
