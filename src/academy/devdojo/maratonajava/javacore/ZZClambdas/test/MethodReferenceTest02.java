package academy.devdojo.maratonajava.javacore.ZZClambdas.test;
//Reference to an instance method of a particular object

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("One piece", 900), new Anime("Naruto", 1)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
