/*Задание No3
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.*/
package Sem_4_LinkedList_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sem_4_3_StackQueue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Stack<Integer> stk = new Stack<>();
        for (int elem : arr) {
            stk.push(elem);
        }
        // System.out.println("Stack " + stk);

        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }

        System.out.println();
        Queue<Integer> queue = new LinkedList<>();
        for (int elem : arr) {
            queue.add(elem);
        }
        System.out.println("Queue " + queue);
    }
}
