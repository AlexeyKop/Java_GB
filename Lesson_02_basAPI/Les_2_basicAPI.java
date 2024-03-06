package Lesson_02_basAPI;

import java.io.File;

public class Les_2_basicAPI {
    /*Что такое API для нас: строки.
Простой пример Создать строку из 1 млн плюсиков. Как?*/
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 1_000_000; i++) {   // будет выполняться ≈41000 ms
//            str += "+";
//        }

        // с помощью    StringBuilder:
//        StringBuilder sb = new StringBuilder(); // будет выполняться ≈9 ms
//        for (int i = 0; i < 1_000_000; i++) {
//            sb.append("+");
//        }
//        System.out.println(sb);

/*        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        // System.out.println(sb);*/

/*        String[] name = {"C", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й*/

        // Работа с файловой системой. Файлы

      /*  String pathProject = System.getProperty("user.dir"); // System.getProperty возвращает корневой каталог текущего проекта.
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt - относительный путь указывает расположение относительно текущего рабочего каталога
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt  - абсолютный (полный) путь, начинается с корневого католога С:*/

        // Работа с файловой системой. Файлы. Ошибки

//        try {   Код, в котором может появиться ошибка
//        } catch (Exception e) {
//        Обработка, если ошибка случилась
//        } finally {
//        Код, который выполнится в любом случае }

/*        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }*/

        // чтобы избежать блоков try - catch, можно сделать дополнительную проверку if - else

/*        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }*/



    }
}

