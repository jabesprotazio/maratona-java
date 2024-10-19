package atividade_Ricardo;

import java.util.Scanner;

public class AccountEnergy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float kWh;
        System.out.println("Informe o kWh consumido: ");
        kWh =  keyboard.nextFloat();

        if (kWh <= 100 ){
            float value = kWh * 0.50F;
            System.out.println("O valor a pagar é: " + value);
        } else if (kWh > 101 || kWh < 200) {
            float value = kWh * 0.70F;
            System.out.println("O valor a pagar é: " + value);
        } else{
            float value = kWh * 0.90F;
            System.out.printf("O valor a pagar é: " + value);
        }


    }
}
