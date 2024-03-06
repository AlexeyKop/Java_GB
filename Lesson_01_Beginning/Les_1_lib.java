package Lesson_01_Beginning;

import java.io.*;

public class Les_1_lib {
    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) throws Exception {
        // Чтение файлов, Вариант посимвольно

/*        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }*/

        // Вариант построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
