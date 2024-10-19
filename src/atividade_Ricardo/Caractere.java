package atividade_Ricardo;

import java.util.Scanner;

public class Caractere {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String caractere;
        System.out.println("Informe um caractere: ");
        caractere = (String) keyboard.nextLine();
        char caract = 0;

    if(caractere.length() > 0){
         caract = caractere.charAt(0);
    }

        if(Character.isUpperCase(caract)){
            System.out.print("O caractere é uma letra,maiúscula!");
        }else if (Character.isLowerCase(caract)) {
            System.out.println("O caractere é uma letra,minúscula!");
        }else if (Character.isDigit(caract)) {
            System.out.println("O caractere é um número!");
        }else {
            System.out.println("O caractere é um símbolo especial!");
        }
    }
}
