package atividade_Ricardo;

import java.util.Scanner;

public class ProgressiveDiscount {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double purchase;
        System.out.printf("Informe o valor da compra: ");
        purchase = keyboard.nextDouble();

        if (purchase <= 100.00) {
            System.out.println("Sua compra não recebe desconto!");
        } else if (purchase < 200.00) {
            System.out.print("Sua compra de " + purchase + " recebeu um desconto de 10% " + "\n" +
                    "Logo o valor a pagar é ");
            purchase -= purchase * 10/100;

            System.out.println(purchase);
        } else {
            System.out.print("Sua compra de " + purchase + " recebeu um desconto de 20% " + "\n" +
                    " Logo o valro a pagar é ");
            purchase -= purchase * 20/100;

            System.out.println(purchase);
        }
    }
}
