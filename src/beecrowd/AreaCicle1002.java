package beecrowd;

import java.util.Scanner;

public class AreaCicle1002 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double R = keyboard.nextDouble();
        double n =  3.14159D;
        double A = Math.pow(R,2) * n;
        System.out.printf("A=%.4f\n" , A);

    }
}
