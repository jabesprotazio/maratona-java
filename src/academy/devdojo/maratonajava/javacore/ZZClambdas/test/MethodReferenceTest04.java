package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeAcomparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("One piece", 900), new Anime("Naruto", 1)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        //Supplier<Anime> animeSupplier = Anime()::new;
        BiFunction<String, Integer, Anime> animeFunction = (title,episode) -> new Anime(title, episode);
        BiFunction<String, Integer, Anime> animeFunction2 = Anime::new;
        Anime anime = animeFunction2.apply("Tiple", 12);
        System.out.println(anime);
    }

}
