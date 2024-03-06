/*1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */
package Sem_4_LinkedList_Queue;

import java.util.LinkedList;

public class Sem_4_5_HW_ReversLinkedList {
    public static void main(String[] args) {
        // Создаем LinkedList и добавляем элементы
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("One");
        linkedList.add("2");
        linkedList.add("Two");
        linkedList.add("Three");

        // Выводим исходный список
        System.out.println("Original LinkedList: " + linkedList);

        // Вызываем метод для переворачивания списка
        reverseLinkedList(linkedList);

        // Выводим перевернутый список
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    public static void reverseLinkedList(LinkedList<String> list) {
        int size = list.size();
        // Проходим только до середины списка, иначе элементы будут переставляться обратно
        for (int i = 0; i < size / 2; i++) {
            // Обмениваем местами элементы с обратными индексами
            String temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
