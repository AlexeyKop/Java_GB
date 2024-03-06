package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Задание No1
 📌Заполнить список десятью случайными числами.
 📌Отсортировать список методом sort() и вывести его на экран.*/
public class Sem_3_1_sortCollections {
    public static void main(String[] args) {
        int size = 10;
        int max = 20;
        List<Integer> list = getIntegerList(size, max);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> getIntegerList(int size, int max) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(max));
        }
        return list;
    }
}
