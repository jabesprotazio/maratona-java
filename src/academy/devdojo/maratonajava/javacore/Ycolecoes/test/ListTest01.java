package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes.add("Suane");

for (int i = 0; i < nomes.size(); i++) {
    System.out.println(nomes.get(i));
        }
    }
}
