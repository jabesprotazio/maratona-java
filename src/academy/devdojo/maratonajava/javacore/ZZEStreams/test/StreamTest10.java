package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        /*Stream.iterate(new int[]{0,1},   )
                .limit(19)
                .forEach(System.out::print);*/

        // 0,1,1,2,3,5,8,13,21,34
        // 0 1
        //(0,1) (1,1) (1,2) (2,3) (3,5) (5,8)

        /*Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(n -> System.out.println(Arrays.toString(n)));
    */

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .map( n -> n[0])
                .limit(10)
                .forEach(n -> System.out.print(n + " "));

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,500))
                .limit(90)
                .forEach(System.out::println);
    }
}
