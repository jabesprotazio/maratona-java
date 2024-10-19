package atividade_Ricardo;

import java.util.Scanner;

public class ThermometricScale {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float value;
        int valueChoose;

        System.out.println("Informe a temperatura em Celsius: ");
        value = keyboard.nextFloat();



        do {
            System.out.println("Escolha uma das opções de escala termométrica: ");
            System.out.println("1 - Fahrenheit");
            System.out.println("2 - Kelvin");
            System.out.println("3 - Vazar daqui!");
            valueChoose = keyboard.nextInt();


            if(valueChoose == 1){
                float valueEnd = (((value * 9) / 5) + 32);
                System.out.println("O valor "+ value+"°C em Fahrenheit é " + valueEnd);
            } else if (valueChoose == 2) {
                float valueEnd = value + 273.15F;
                System.out.println("O valor "+ value+"°C em Kelvin é " + valueEnd);
            }

        }while (valueChoose == 1 || valueChoose == 2);
        System.out.println("Até mais!");
    }
}
