package Sem_5_Map;

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Строим сортирующее дерево (кучу) из массива
        // Начинаем с последнего элемента, который имеет потомков
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Строим сортирующее дерево из массива
        buildTree(sortArray, sortLength);

        // Постепенно уменьшаем размер кучи на один
        for (int i = sortLength - 1; i > 0; i--) {
            // Перемещаем корень кучи в конец массива
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // После перемещения корня, восстанавливаем свойство кучи
            heapify(sortArray, i, 0);
        }
    }

    private static void heapify(int[] tree, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок узла i
        int right = 2 * i + 2; // Правый потомок узла i

        // Если левый потомок больше корня
        if (left < n && tree[left] > tree[largest]) {
            largest = left;
        }

        // Если правый потомок больше наибольшего элемента
        if (right < n && tree[right] > tree[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;

            // Продолжаем рекурсивно устанавливать свойство кучи в поддереве
            heapify(tree, n, largest);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class S_5_6_HW_HeapSort {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{5, 8, 12, 3, 6, 9};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));

        HeapSort.heapSort(initArray, initArray.length);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

