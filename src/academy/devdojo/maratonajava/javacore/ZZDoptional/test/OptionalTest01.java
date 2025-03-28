package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    Optional<String> name;
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        String name = "James";
        //Optional<String> o2 = Optional.of(findName(name));
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        // System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------");
        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

}
