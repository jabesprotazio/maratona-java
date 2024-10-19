package academy.devdojo.maratonajava.introducao.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        nomes2.add("William");
        nomes2.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");
        Collections.sort(nomes2);

        nomes.addAll(nomes2);

        for (String nome : nomes2){
            System.out.println(nome);
        }
        System.out.println("--------");

     }
}
