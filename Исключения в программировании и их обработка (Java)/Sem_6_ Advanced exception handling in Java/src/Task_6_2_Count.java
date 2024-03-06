/*Задание No2
📌Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException*/
public class Task_6_2_Count {
    public static void main(String[] args) throws Exception {   // необходимо добавить throws Exception - то, что мы можем пробрасывать исключения
        try (Task_6_2_CountCount counter = new Task_6_2_CountCount()){
            System.out.println(counter);
            counter.add();  // метод .add - инкременируем счетчик
            System.out.println(counter);
        }

        Task_6_2_CountCount counter = new Task_6_2_CountCount();
        System.out.println(counter);
        counter.add();  // метод .add - инкременируем счетчик
        System.out.println(counter);
        counter.close();
        counter.add();  // при вызове метода .add получем IOException, т.к. с закрытым объектом взаимодействовать нельзя.

    }
}
