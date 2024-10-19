package atividade_Ricardo;

import java.util.Scanner;

public class PasswordCorrectOrNot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        System.out.println("Informe a senha: ");
        password = keyboard.nextLine();

        if(password.equals("senha123")){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
        }
    }
}
