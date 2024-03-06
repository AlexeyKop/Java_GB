package Sem_3_JAVA_intro;/*Задание No0
 📌Даны следующие строки, cравнить их с помощью == (СРАВНИВАЕТ ССЫЛКИ НА ОБЪЕКТЫ)и метода equals() класса Object
 📌String s1 = "hello";
 📌String s2 = "hello";
 📌String s3 = s1;
 📌String s4 = "h" + "e" + "l" + "l" + "o";
 📌String s5 = new String("hello");
 📌String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});*/
/*Стек (stack) — это область памяти, которая работает по схеме LIFO (последним вошёл, первым вышел).
Стек хранит значения примитивных переменных, создаваемых в методах, а также ссылки на объекты в куче.

Куча (heap) — это область памяти, которая используется для динамического выделения памяти для объектов и
классов JRE во время выполнения. Новые объекты всегда создаются в куче, а ссылки на них хранятся в стеке.*/

public class Sem_3_0_CompareStrings {
    public static void main(String[] args) {
        String s1 = "hello";    //если строка создается с помощью литералов "", то она автоматически
                                // добавляется в ПУЛ СТРОК в HEAP (куча)
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));  //сравнивать строки в Java надо с помощью метода s1.equals(s2) класса Object
        System.out.println();
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3)); // метод s1.equals(s2) тоже как и (==) сравнивает ссылки,
                                            // но в классе String он ПЕРЕОПРЕДЕЛЕН
                                    // класс String наследует класс Object
        System.out.println("s1 == s4");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        System.out.println("s1 == s5");
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));

        System.out.println("s1 == s6");
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));

        System.out.println("s5 == s6");
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
