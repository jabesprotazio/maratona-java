package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
    int codeOfProduct1,codeOfProduct2, quantifiers1, quantifiers2;
    double price1,price2, valuePay;

    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    codeOfProduct1 = keyboard.nextInt();
    quantifiers1 = keyboard.nextInt();
    price1 = keyboard.nextDouble();

    codeOfProduct2 = keyboard.nextInt();
    quantifiers2 = keyboard.nextInt();
    price2 = keyboard.nextDouble();

    valuePay = ((quantifiers1*price1) + (quantifiers2*price2));
    System.out.println("VALOR A PAGAR: R$ " + df.format(valuePay));


    }
}
