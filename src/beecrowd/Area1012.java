package beecrowd;

    import java.text.DecimalFormat;
    import java.util.Scanner;

public class Area1012 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double A,B,C, pi = 3.14159,areaRectangledTringle,areCircle,areTrapezium,areaSquare,areaRectangle;

        A = keyboard.nextDouble();
        B = keyboard.nextDouble();
        C = keyboard.nextDouble();

        areaRectangledTringle = (A * C) /2;
        System.out.println("TRIANGULO: " + df.format(areaRectangledTringle));

        areCircle = (Math.pow(C,2)*pi);
        System.out.println("CIRCULO: " + df.format(areCircle));

        areTrapezium = (((A + B)*C) /2);
        System.out.println("TRAPEZIO: " + df.format(areTrapezium));

        areaSquare = Math.pow(B,2);
        System.out.println("QUADRADO: " + df.format(areaSquare));

        areaRectangle = (A * B);
        System.out.println("RETANGULO: " + df.format(areaRectangle));
    }
}
