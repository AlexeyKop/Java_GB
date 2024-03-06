package Sem_4_LinkedList_Queue;

import java.util.ArrayList;
import java.util.LinkedList;

/*Задание No0
📌1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.*/
public class Sem_4_0_CompareLists {
    public static void main(String[] args) {
        int count = 100_000;

        System.out.println("Add to End of Array");
        long start = System.currentTimeMillis();
        getArrayListAddLast(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Add to End of List");
        start = System.currentTimeMillis();
        getLinkedListAddLast(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("Add to First of Array");
        start = System.currentTimeMillis();
        getArrayListAddFirst(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Add to First of List");
        start = System.currentTimeMillis();
        getLinkedListAddFirst(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("Add to Middle of Array");
        start = System.currentTimeMillis();
        getArrayListAddMiddle(count);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Add to Middle of List");
        start = System.currentTimeMillis();
        getLinkedListAddMiddle(count);
        System.out.println(System.currentTimeMillis() - start);

    }
    public static ArrayList<Integer> getArrayListAddLast(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);   // добавляет в конец
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddLast(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);   // добавляет в конец
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);   // добавляет в начало
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddFirst(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);   // добавляет в начало
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, i);   // добавляет в середину
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddMiddle(int count){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size() / 2, i);   // добавляет в середину
        }
        return linkedList;
    }

}
