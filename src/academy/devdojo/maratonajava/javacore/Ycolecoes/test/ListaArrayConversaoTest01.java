package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {



        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(1);
        numerosList.add(2);
        numerosList.add(3);

        Integer[] listToArray = numerosList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-------------");


        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        /*List<Integer> arrayToList = Arrays.asList(numerosArray);
        //arrayToList.set(1,12);
        arrayToList.add(13);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);*/

        System.out.println("----------------");
        List<Integer> numerosLista = new ArrayList<>(Arrays.asList(numerosArray));
        numerosLista.add(15);
        System.out.println(numerosLista);

        Arrays.asList(1,3);

    }
}
