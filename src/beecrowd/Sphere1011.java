package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere1011 {
    public static void main(String[] args) {
    double pi = 3.14159, volume,radius;

    DecimalFormat df = new DecimalFormat("0.000");

    Scanner keyboard = new Scanner(System.in);
    radius = keyboard.nextDouble();
    volume = ((4/3.0)*(pi))*(Math.pow(radius,3));
    System.out.println("VOLUME = " + df.format(volume));

    }
}
