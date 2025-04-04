package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamTest07 {
    public static void main(String[] args) {
        AtomicInteger value = new AtomicInteger();
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,(x,y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::sum));

        System.out.println("---------");
        integers.stream().reduce((x,y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,(x,y) -> x * y));

        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(10,(x,y) -> x > y ? x : y));
        System.out.println(integers.stream().reduce(10,Integer::max));

        /*integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        integers.stream().reduce(( ))*/

    }

}
