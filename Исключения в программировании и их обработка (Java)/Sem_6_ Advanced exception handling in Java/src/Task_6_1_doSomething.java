import java.io.IOException;

/*Задание No1
📌Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
(тело самого метода прописывать необязательно). Вызовите этот метод из main и обработайте в нем исключение,
которое вызвал метод doSomething().*/
public class Task_6_1_doSomething {
    public static void main(String[] args) {
        try{
            doSomething();
        }
        catch (IOException e){
            System.out.println("Исключение Ввода-вывода");
        }
    }

    public static void doSomething() throws IOException {   // будет возвращать исключения ввода-вывода
        throw new IOException();
    }
}
