package Sem_6_Sets;

import java.util.*;

/*Задание No0
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.*/
public class S_6_0_CompareSets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 58, 3, 2, 48, 4, 5, 6, 3));
                                    // добавление элементов по хэш-кодам
//        hashSet.add(3);
//        hashSet.add(6);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 48, 2, 4, 58, 5, 6, 3));
                                    // сохраняет порядок добавления
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 48, 59, 2, 3, 2, 4, 5, 6, 3));

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
