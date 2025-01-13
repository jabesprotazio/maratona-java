package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista,new Consumidor("Midoriya"));

        for (Object s : lista) {
            System.out.println(s);
        }


    }
        public static void add (List lista, Consumidor consumidor){
            lista.add(consumidor);
        }
    }

