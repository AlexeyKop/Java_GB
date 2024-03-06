package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Задание No4
📌Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры.*/
public class Sem_3_4_BookStore {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("книга_1", "книга_2", "книга_3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("книга_4", "книга_5", "книга_6"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("книга_7", "книга_8", "книга_9"));
        catalog.add(genre1);
        catalog.add(genre2);
        catalog.add(genre3);
        System.out.println(catalog);
        for (ArrayList<String> genre : catalog){
            System.out.println(genre);
        }

    }
}
