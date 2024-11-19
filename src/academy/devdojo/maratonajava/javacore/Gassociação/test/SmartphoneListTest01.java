package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);


        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222333", "Pixel");
        Smartphone s5 = new Smartphone("22222123", "Pixel");
        smartphones.add(s4);
        smartphones.add(s5);
        int indexSmartphone5 = smartphones.indexOf(s5);
        System.out.println(indexSmartphone5);
        if(smartphones.contains(s5)) {
            System.out.println(smartphones.get(indexSmartphone5));
        }else {
            System.out.println("Não encontrado!");
        }

    }
}
