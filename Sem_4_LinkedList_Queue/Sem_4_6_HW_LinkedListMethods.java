/*Реализуй очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя,
getElements() - возвращает все элементы в очереди.*/
package Sem_4_LinkedList_Queue;

import java.util.LinkedList;

public class Sem_4_6_HW_LinkedListMethods {
    public static class QueueWithLinkedList {
        private LinkedList<Integer> queue;

        // Конструктор инициализирует LinkedList
        public QueueWithLinkedList() {
            queue = new LinkedList<>();
        }

        // Метод помещает элемент в конец очереди
        public void enqueue(int element) {
            queue.addLast(element);
        }

        // Метод возвращает первый элемент из очереди и удаляет его
        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return queue.removeFirst();
        }

        // Метод возвращает первый элемент из очереди, не удаляя его
        public int first() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return queue.peekFirst();
        }

        // Метод возвращает все элементы в очереди
        public LinkedList<Integer> getElements() {
            return queue;
        }

        // Метод проверяет, пуста ли очередь
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public static void main(String[] args) {
            QueueWithLinkedList queue = new QueueWithLinkedList();

            // Добавляем элементы в очередь
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);

            // Выводим элементы в очереди
            System.out.println("Elements in the queue: " + queue.getElements());

            // Удаляем первые два элемента
            queue.dequeue();
            queue.dequeue();

            // Выводим элементы после удаления
            System.out.println("Elements after dequeuing: " + queue.getElements());

            // Выводим первый элемент
            System.out.println("First element in the queue: " + queue.first());
        }
    }
}
