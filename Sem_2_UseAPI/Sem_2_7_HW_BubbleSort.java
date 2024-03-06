package Sem_2_UseAPI;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem_2_7_HW_BubbleSort {

    private static final Logger logger = Logger.getLogger(Sem_2_7_HW_BubbleSort.class.getName());

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 3, 1};
        sort(arr);
    }

    public static void sort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

                logArray(arr);

            n--;
        } while (swapped);
    }

    private static void logArray(int[] arr) {
        try {
            FileHandler fileHandler = new FileHandler("Sem_2_UseAPI/log.txt", true);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleFormatter formatter = new SimpleFormatter() {
                @Override
                public String format(java.util.logging.LogRecord record) {
                    StringBuilder builder = new StringBuilder();
                    builder.append(dateFormat.format(new Date()));
                    builder.append(" ");
                    builder.append(Arrays.toString(arr));
                    builder.append("\n");
                    return builder.toString();
                }
            };
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);

            // logger.info("");
            fileHandler.close();
            // Выводим тот же формат в консоль
            System.out.println(dateFormat.format(new Date()) + " " + Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
