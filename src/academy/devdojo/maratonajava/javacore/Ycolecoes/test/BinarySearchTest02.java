package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.9));
        mangas.add(new Manga(1L,"Berserk",9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on titan",11.20));
        mangas.add(new Manga(2L,"Dragon ball 2",2.99));
//        Index  0,1,2,3,4
//        Values 5,1,4,3,2
//        Collections.sort(mangas);
        //mangas.sort(mangaByIdComparator);
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToCompare = new Manga(1L, "Bragon ball 2", 2.99);
         //System.out.println(Collections.binarySearch(mangas,mangaToCompare,mangaByIdComparator));
        System.out.println(Collections.binarySearch(mangas,mangaToCompare));
    }
}
