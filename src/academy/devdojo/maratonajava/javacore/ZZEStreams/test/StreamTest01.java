package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1 . Order LighNovel by title
//2. Retrieve the first 3 light noves with price less than 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> namesWithPriceLessFour = new ArrayList<>(List.of());
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                namesWithPriceLessFour.add(lightNovel.getTitle());
            }
            if(namesWithPriceLessFour.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels); 
        System.out.println(namesWithPriceLessFour);
    }

}
