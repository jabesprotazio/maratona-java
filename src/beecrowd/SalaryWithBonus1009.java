package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryWithBonus1009 {
    public static void main(String[] args) {
        String name;
        double porcentagem = 15;
        double salaryFix, sales, total;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        name = (String) keyboard.next();
        salaryFix = keyboard.nextDouble();
        sales = keyboard.nextDouble();

        total = (sales *  (porcentagem/100)) + salaryFix;
        System.out.println("TOTAL = R$ " + df.format(total));
    }
}
