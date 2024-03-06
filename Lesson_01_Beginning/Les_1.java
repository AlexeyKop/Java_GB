package Lesson_01_Beginning;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Character.forDigit;
import static java.lang.Character.getType;

public class Les_1 {
    public static void main(String[] args) {
        // ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ

//        float f = 123.45F; // веществ.тип данных с F на конце (float обеспечивает точность до 6-7 десятичных знаков)
//        double d = 123.45;  // double более точный тип данных, обеспечивает точность до 15-16 десятичных знаков
//        System.out.println(f);
//        System.out.println(d);

/*        char ch = '1';
        System.out.println(Character.isDigit(ch));  // true
        ch = 'a';
        // System.out.println(ch);
        System.out.println(Character.isDigit(ch)); // false
*/

/*        boolean flag1 = 123 <= 234;
        System.out.println(flag1);  // true
        boolean flag2 = 123 >= 234 || flag1; // || - логическое ИЛИ, & - логическое И
        System.out.println(flag2);  // true
        boolean flag3 = flag1 ^ flag2;  // ^ - caret, Исключительное ИЛИ - разделительная дизъюнкция
        System.out.println(flag3);  // false
*/
//        String msg = "Hello world";
//        System.out.println(msg); //   Hello   world

/*        // НЕЯВНАЯ ТИПИЗАЦИЯ
        var a = 123; // var (variable) - переменная
        System.out.println(a);  // 123
        var d = 123.456;
        System.out.println(d);  // 123.456
        System.out.println(getType(a));  // Integer
        System.out.println(getType(d));  // Double
    }
    static String getType (Object o){
        return o.getClass().getSimpleName();
        }*/


        // ОПЕРАЦИИ JAVA
       /* int a = 123;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        a = --a - a--;
        System.out.println(a);*/

/*        int a = 5;
        int b = 2;
        System.out.println(a | b);  // побитовые операции | - ИЛИ
        // 101
        // 010
        // 111  => 7
        System.out.println(a & b);  // побитовые операции & - И
        // 101
        // 010
        // 000  => 0
        System.out.println(a ^ b);  // побитовые операции & - исключительное ИЛИ
        // 101
        // 010
        // 111  => 7*/

        // МАССИВЫ

/*        int[] arr = new int[10];  // задать массив
        arr[3] = 13;
        System.out.println(arr[3]);
        System.out.println(arr.length); // 10

        arr = new int[]{1, 2, 3, 4, 5}; // либо такой способ
        System.out.println(arr.length); // 5*/

        // МНОГОМЕРНЫЕ МАССИВЫ

/*        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }*/

/*        int[][] arr = new int[3][5];  // др.способ задания 2-мерного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }*/

        // ПРЕОБРАЗОВАНИЯ

        /*int i = 123;
        double d = i;
        System.out.println(i);  // 123
        System.out.println(d);  // 123.0

        d = 3.1415;
        i = (int) d;
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3

        d = 3.9415;
        i = (int) d;
        System.out.println(d);  // 3.9415
        System.out.println(i);  // 3

        byte b = Byte.parseByte("123");
        System.out.println(b);  // 123

        b = Byte.parseByte("1234"); // байт состоит из 8 бит и может принимать одно из 256 различных значений (от 0 до 255)
        System.out.println(b);  // NumberFormatException: Value out of range (Значение вне диапазона)*/

        // Получение данных из терминала

/*        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();*/

/*        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input integer a: ");
        int x = iScanner.nextInt();
        System.out.printf("Input double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();*/

        // Проверка на соответствие получаемого типа
/*        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input integer a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();*/

        // Форматированный вывод

/*        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);*/

/*        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.println(res);
        System.out.printf("%d + %d = %d \n", a, b, c); // %d: целочисленных значений
                                                        // %f: для вывода чисел с плавающей точкой
                                                        // %s: для вывода строковых значений

        float pi=3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14  вывод кол-ва знаков после запятой
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00*/

        // Область видимости переменных
        //  У переменных существует понятие «область видимости». Если переменную объявили внутри
        //  некоторого блока фигурных скобок { }, то снаружи этого блока переменная будет недоступна.

/*        { int i=123;
            System.out.println(i);
        }
        System.out.println(i);  // error: cannot find symbol*/

        // Функции и методы
        // Функции и методы — это технически одно и то же.
        // Функции могут не принадлежать классам, а методы принадлежат.
        // В java все функции являются методами.


/*        sayHi(); // hi!

        Lesson_01_Beginning.Les_1_lib.sayHello(); // Hello World! Можно этот метод прописать в др.файле

        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }

    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {  // рекурсия
        if (n == 1) return 1;       // любая рекурсия ничинается с условия выхода из рекурсии
        return n * factor(n - 1);
    }*/

        // Управляющие конструкции: условный оператор

/*        int a = 1;
        int b = 2;
        int c = 0;
//        if (a>b) {
//            c=a;
//        }
//        else {
//            c=b;
//        }
        if (a > b) c = a;   // укороченный вариант
        if (b > a) c = b;

        System.out.println(c);*/

        // тернарный оператор

/*        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // если условие выполн, то возвращается та часть, котор от ? до :
                                // если услов не выполн, то вернется значен b
        System.out.println(min);*/

        // Оператор выбора

/*        int mounth = 1; // value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            //...

            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        // iScanner.close();*/

        // Цикл while
/*

        int value = 321;
        int count = 0;

//        while (value != 0) {
//            value /= 10;
//            count++;
//        }

        // Цикл do while

        do {
            value/=10;
            count++;
        } while (value!=0);

        System.out.println(count);
*/
        // Оператор цикла for

/*        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);*/

        // Вложенные циклы

/*        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // for each. Работает только для коллекций

/*        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();*/

/*        int[] arr = new int[] {1,2,3,4,5,77};  // массивы - частный случай коллекции
        for (int item: arr) {
            item = 13;
            // System.out.println(item);
        }

        for (int item: arr) {

            System.out.println(item);
        }*/

        // Работа с файлами

        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Чтение, Вариант посимвольно (cv. Lesson_01_Beginning.Les_1_lib)


    }

}