/*Задание No2
Реализовать консольное приложение, которое:
1.Принимает от пользователя и “запоминает” строки.
2.Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3.Если введено revert, удаляет предыдущую введенную строку из памяти.*/
package Sem_4_LinkedList_Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Sem_4_2_AppPrintString {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter string to add to the list");
            System.out.println("print - for output in reverse order");
            System.out.println("revert - to remove the last line");
            System.out.println("exit - for exit");

            String inputData = scan.nextLine();
            if (inputData.equals("exit")) break;
            if (inputData.equals("print")) {
                for (int i = linkedList.size() - 1; i >= 0; i--) {
                    System.out.print(linkedList.get(i) + " ");
                }
                System.out.println();
            } else if (inputData.equals("revert")) {
                if (!linkedList.isEmpty()) linkedList.removeLast();
                System.out.println(linkedList);
            } else {
                linkedList.add(inputData);
                System.out.println(linkedList);
            }
        }
        scan.close();
    }
}
