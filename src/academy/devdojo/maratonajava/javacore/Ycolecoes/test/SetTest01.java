package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        //Set<Manga> mangas = new LinkedHashSet<>();
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on titan",11.20,2));
        mangas.add(new Manga(6L,"Dragon ball 2",2.99,0));
        mangas.add(new Manga(6L,"Dragon ball 2",2.99,0));

        mangas.getClass();

        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
