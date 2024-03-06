package Sem_6_OOP;
/*Задание No4
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainCat {
    public static void main(String[] args) {
        ClassCat cat1 = new ClassCat("Барсик", 6, "Черный");
        ClassCat cat2 = new ClassCat("Марсик", 4, "Белый");
        ClassCat cat3 = new ClassCat("Мурка", 2, "Рыжий");
        ClassCat cat33 = new ClassCat("Мурка", 2, "Рыжий");
        ClassCat cat11 = new ClassCat("Барсик", 6, "Черный");

//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);

        Set<ClassCat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat33, cat11));
        for (ClassCat cat : cats){
            System.out.println(cat);
        }

    }
}
