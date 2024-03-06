package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Arrays;

/*Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
Необходимо удалить из списка четные числа и вернуть результирующий.
Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:
Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>*/
public class Sem_3_6_HW_RemoveEvenNumbers {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr2 = {2, 4, 6, 8};

        // Преобразуем массивы в списки ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        // Вызываем метод для удаления четных чисел
        ArrayList<Integer> result1 = removeEvenNumbers(list1);
        ArrayList<Integer> result2 = removeEvenNumbers(list2);

        // Выводим результаты
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

    // Метод для удаления четных чисел из списка
    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) {
        // Создаем новый список для хранения результата
        ArrayList<Integer> result = new ArrayList<>();

        // Проходим по каждому элементу в исходном списке
        for (Integer num : list) {
            // Проверяем, является ли число нечетным
            if (num % 2 != 0) {
                // Если нечетное, добавляем в новый список
                result.add(num);
            }
        }

        // Возвращаем результирующий список без четных чисел
        return result;
    }
}
