/*Задание No4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().*/
package Sem_4_LinkedList_Queue;

public class Sem_4_4_StackArray {
    public static int[] arr;
    public static int size;
    public static int topIndex;

    public static void main(String[] args) {
        size = 5;
        topIndex = -1;
        arr = new int[size];

        System.out.println("size " + size());
        System.out.println("empty " + empty());
        push(1);
        push(3);
        push(9);
        System.out.println("arr " + arr);
        System.out.println("size " + size());
        System.out.println("empty " + empty());
        System.out.println("pop " + pop());
        System.out.println("size " + size());


    }
    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int elem) {  // Push — это операция в Java, которая вставляет элемент на вершину стека
                                        // (то есть над его текущим верхним элементом).
//        arr[topIndex + 1] = elem;
//        topIndex++;
        arr[++topIndex] = elem;
        // System.out.println("arr::: " + arr);
    }

    public static int peek() {  // возвращает элемент из стека
        return arr[topIndex];
    }

    public static int pop() {   // возвращает и удаляет последний элемент
        return arr[topIndex--];
    }
}
