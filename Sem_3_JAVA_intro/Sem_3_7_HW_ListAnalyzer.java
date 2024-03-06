package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число}
- Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.*/
public class Sem_3_7_HW_ListAnalyzer {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};

        // Создаем список ArrayList, заполненный числами из исходного массива
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Сортируем список по возрастанию
        Collections.sort(list);

        // Выводим отсортированный список на экран
        System.out.println("Sorted list: " + list);

        // Находим и выводим минимальное значение в списке
        int min = Collections.min(list);
        System.out.println("Minimum is " + min);

        // Находим и выводим максимальное значение в списке
        int max = Collections.max(list);
        System.out.println("Maximum is " + max);

        // Находим сумму всех элементов в списке
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        // Вычисляем и выводим среднее арифметическое
        double average = (double) sum / list.size();


        System.out.println("Average is = " + average);
    }
}
