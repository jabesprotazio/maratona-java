package atividade_Ricardo;

import java.util.Scanner;

public class BiggNumberOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1,number2,number3;

        System.out.print("Informe o 1° número: ");
        number1 = keyboard.nextInt();

        System.out.print("Informe o 2° número: ");
        number2 = keyboard.nextInt();

        System.out.print("Informe o 3° número: ");
        number3 = keyboard.nextInt();

        if(number1 == number2 || number2 == number3 || number1 == number3){
            System.out.println("Dois ou mais números têm o mesmo valor máximo");
        }else {
            if (number1 > number2 && number1 > number3) {
                System.out.printf("O 1° número é o maior!");
            } else if (number2 > number1 && number2 > number3) {
                System.out.printf("O 2° número é o maior!");
            } else {
                System.out.printf("O 3° número é o maior!");
            }
        }



    }
}
