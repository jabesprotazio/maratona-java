package beecrowd;

import java.util.Scanner;

public class Difference1007 {
    public static void main(String[] args) {
        int A,B,C,D, difference;
        Scanner keyboard = new Scanner(System.in);
        A = keyboard.nextInt();
        B = keyboard.nextInt();
        C = keyboard.nextInt();
        D = keyboard.nextInt();

        difference = ((A*B) - (C*D));
        System.out.println("DIFERENCA = " + difference);

    }
}
