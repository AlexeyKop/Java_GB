package Sem_3_JAVA_intro;/*Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.*/
/*Этот код содержит метод mergeSort, который сортирует переданный массив целых чисел с помощью алгоритма слияния.
Он разделяет массив пополам, рекурсивно вызывает себя для каждой половины, а затем сливает
отсортированные половины в один отсортированный массив с помощью метода merge.*/
import java.util.Arrays;
public class Sem_3_5_HW_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 3, 4};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    // Метод mergeSort для сортировки массива с помощью сортировки слиянием
    public static int[] mergeSort(int[] arr) {
        // Если массив имеет один элемент или меньше, он уже отсортирован
        if (arr.length <= 1) {
            return arr;
        }

        // Находим середину массива
        int middle = arr.length / 2;
        // Создаем новые массивы, один из левой половины, другой из правой
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        // Рекурсивно сортируем левую и правую части массива
        left = mergeSort(left);
        right = mergeSort(right);

        // Объединяем отсортированные части вместе
        return merge(left, right);
    }

    // Метод merge для слияния двух отсортированных массивов в один отсортированный
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        // Сравниваем элементы из левого и правого массивов и добавляем минимальный в результат
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        // Добавляем оставшиеся элементы из левого массива, если они есть
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        // Добавляем оставшиеся элементы из правого массива, если они есть
        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}


