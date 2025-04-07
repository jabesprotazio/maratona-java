package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category.DRAMA;
import static academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category.FANTASY;
import static academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.Category.ROMANCE;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, FANTASY),
            new LightNovel("Overlord", 10.99, FANTASY),
            new LightNovel("Violet Evergarden", 5.99, DRAMA),
            new LightNovel("No Game no life", 2.99, FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Monogatari", 4.00, ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNoveltMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;

            }
        }
        categoryLightNoveltMap.put(Category.DRAMA, drama);
        categoryLightNoveltMap.put(FANTASY, fantasy);
        categoryLightNoveltMap.put(ROMANCE, romance);
        System.out.println(categoryLightNoveltMap);


        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);
    }
}
