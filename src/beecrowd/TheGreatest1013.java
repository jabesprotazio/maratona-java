package beecrowd;

import java.util.Scanner;

public class TheGreatest1013 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int a,b,c,maiorFirst, maior;

    a = keyboard.nextInt();
    b = keyboard.nextInt();
    c = keyboard.nextInt();


    maiorFirst = (a+ b + Math.abs(a-b))/2;
    maior = (maiorFirst+ c + Math.abs(maiorFirst-c))/2;
    System.out.println(maior + " eh o maior");

    }
}
