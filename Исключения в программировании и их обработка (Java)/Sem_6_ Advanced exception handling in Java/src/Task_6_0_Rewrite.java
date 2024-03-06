/*Задание No0
 📌Перепишите следующий код, используя ресурсный try */
import java.io.*;
import java.io.IOException;
import java.nio.file.*;



public class Task_6_0_Rewrite {
    public static void main(String[] args) {

    }

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        }

//        BufferedReader in = null;
//
//        BufferedWriter out = null;
//
//        try {
//
//            in = Files.newBufferedReader(pathRead);
//
//            out = Files.newBufferedWriter(pathWrite);
//
//            out.write(in.readLine());
//
//        } finally {
//
//            try {
//
//                if (in != null) in.close();
//
//            } catch (IOException e) {
//
//            }
//
//            try {
//
//                if (out != null) out.close();
//
//            } catch (IOException e) {
//
//            }
//        }
    }
}
