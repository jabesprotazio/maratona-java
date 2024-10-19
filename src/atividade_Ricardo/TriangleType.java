package atividade_Ricardo;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float angle1, angle2, angle3 = 0;

        System.out.println("Informe o valor do primeiro ângulo: ");
        angle1 = keyboard.nextFloat();

        System.out.println("Informe o valor do primeiro ângulo: ");
        angle2 = keyboard.nextInt();

        System.out.println("Informe o valor do primeiro ângulo: ");
        angle3 = keyboard.nextInt();


        if (angle1 < 90 && angle2 < 90 && angle3 < 90){
            System.out.println("O triângulo é Acutângulo");
        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("O triângulo é Retângulo");
        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println("O triângulo é Obtusângulo");
        }else if((angle1+angle2+angle3) > 180) {
            System.out.println("A soma dos ângulos não é 180°");
        }
    }
}
