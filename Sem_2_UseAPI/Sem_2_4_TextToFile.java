package Sem_2_UseAPI;

import java.io.FileWriter;

/*Задание No4 📌Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения. */
public class Sem_2_4_TextToFile {
    public static void main(String[] args) {
        int repeat = 100;
        String word = "TEST";
        // System.out.println(repeatWord("TEST", repeat));
        String str = repeatWord("TEST", repeat);
        writeToFile(str, "Sem_2_UseAPI/TEST100.txt");

    }
    public static String repeatWord(String word, int repeat){
        StringBuilder SB = new StringBuilder();
        for (int i =0; i < repeat; i++){
            SB.append(word).append(" ");
        }

        return SB.toString();
    }

    public static void writeToFile(String str, String fileTEST){
        try (FileWriter FW = new FileWriter(fileTEST)){
            FW.write(str);
            System.out.println("data written to a file");
        } catch (Exception e){
            System.err.println("file write error"); // красным цветом будет выведена ошибка
        }

//        FileWriter FW = null;
//        try {
//            FW = new FileWriter(fileTEST);
//            FW.write(str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            FW.close();
//        }
    }

}
