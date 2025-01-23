package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList);

    }
}
