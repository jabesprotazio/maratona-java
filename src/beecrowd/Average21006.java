package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average21006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A,B,C;
        int WA = 2; int WB = 3; int WC = 5;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        DecimalFormat df = new DecimalFormat("0.0");
        double MEDIA = ((A*WA) + (B*WB) + (C*WC))/(WA + WB + WC);
        System.out.println("MEDIA = " + df.format(MEDIA));
    }
}
