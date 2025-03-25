package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);
        List<String> numbers = new ArrayList<>(List.of("1","2","3"));
        Function<String, Integer> numStringToInteger =  Integer::parseInt;
        int a = numStringToInteger.apply("10");
        System.out.println(a);

        BiPredicate<List<String>, String> checkName = List::contains;

        boolean have = checkName.test(list,"Rimuru");
        System.out.println(have);
    }
}
