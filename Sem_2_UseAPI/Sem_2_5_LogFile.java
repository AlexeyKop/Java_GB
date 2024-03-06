package Sem_2_UseAPI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Задание No5 📌Напишите метод, который вернет содержимое текущей папки в виде массива строк.
📌Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
📌Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.*/
public class Sem_2_5_LogFile {
    private static Logger logger = Logger.getLogger(Sem_2_5_LogFile.class.getName());

    public static void configLogger(){
        try {
            FileHandler FH = new FileHandler("Sem_2_UseAPI/Logi.txt", true);
            logger.addHandler(FH);
            SimpleFormatter formatter = new SimpleFormatter();
            FH.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        configLogger();
        String[] contentFolder = getContentFolder(".");
        // System.out.println(Arrays.toString(contentFolder));
        writeToFile(contentFolder, "Sem_2_UseAPI/TextFolder.txt");

    }
    public static String[] getContentFolder(String foldername){
        File folder = new File(foldername);
        return folder.list();
    }

    public static void writeToFile(String[] strs, String fileTEST) {
        try (FileWriter FW = new FileWriter(fileTEST)) {
            for (String str : strs) {   // цикл for each
                FW.write(str);
                FW.write(System.lineSeparator());   // разделитель, типа \n
            }

            System.out.println("data written to a file");
            logger.log(Level.INFO, "Данные в файле!");
        } catch (Exception e) {
            logger.warning("Ошибка записи в файл");
            System.err.println("file write error");
        }
    }
}
