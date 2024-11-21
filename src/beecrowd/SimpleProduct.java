package beecrowd;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        int A,B,PROD;
        Scanner keyboard = new Scanner(System.in);
        A = keyboard.nextInt();
        B = keyboard.nextInt();

        PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
}
