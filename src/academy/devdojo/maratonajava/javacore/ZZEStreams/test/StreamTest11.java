package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import academy.devdojo.maratonajava.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.size());
        System.out.println((long) lightNovels.size());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        System.out.println(lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)));

        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println("What the sum of valeus Light Novel");
        System.out.println(lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());

        System.out.println(lightNovels.stream()
                .collect(Collectors.summingDouble(LightNovel::getPrice)));


        System.out.println("What the average of valeus Light Novel");
        lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .average().ifPresent(System.out::println);


        System.out.println(lightNovels.stream()
                .collect(Collectors.averagingDouble(LightNovel::getPrice)));


        DoubleSummaryStatistics collect = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect.getAverage());

        System.out.println(lightNovels.stream().map(l -> l.getTitle().split(",")));

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));

        System.out.println(titles.toUpperCase());
    }
}
