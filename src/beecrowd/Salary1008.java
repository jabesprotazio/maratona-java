package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary1008 {
    public static void main(String[] args) {
        int number, hour;
        double valueHour, valueReceb;

        DecimalFormat df = new DecimalFormat("000.00");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        hour = keyboard.nextInt();
        valueHour = keyboard.nextDouble();
        valueReceb = valueHour * hour;

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + df.format(valueReceb));
    }
}
