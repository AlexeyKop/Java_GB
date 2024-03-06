package Sem_1_Beginning;/*Задание No3
📌Дан массив nums = [3,2,2,3] и число val = 3.
📌Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
📌Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.*/

import java.util.Arrays;

public class Sem_1_3 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 2, 3, 4, 3, 8, 3, -10};
        int val = 3;

        MoveToEndElem(arr, val);

        System.out.println(Arrays.toString(arr));

    }

    private static void MoveToEndElem(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[right] == val) {
                right--;
            }

            if (arr[left] == val) {
                arr[left] = arr[right];
                arr[right] = val;
                right--;
            }
            left++;
        }
    }
}
