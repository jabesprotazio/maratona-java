package atividade_Ricardo;

import java.util.Scanner;

public class AgeVote {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.println("Informe sua idade: ");
        age = keyboard.nextInt();

        if(age < 16){

            System.out.println("O cidadão é menor de idade e não pode votar!");

        } else if (age >= 18 && age <= 70 ) {
            System.out.println("O voto para o cidadão é obrigatório!");
        } else if ((age >= 16 || age <= 17) || age > 70) {
            System.out.println("O voto para o cidadão é facultativo!");
        }

    }
}
