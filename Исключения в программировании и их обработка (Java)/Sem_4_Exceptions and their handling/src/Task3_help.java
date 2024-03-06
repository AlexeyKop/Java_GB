import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Task3_help {
    public static void main(String[] args) {
        HashMap<String, Integer> map = readData("D:\\Learning_5.0_D disk\\GeekBrains\\Java_GB\\Исключения в программировании и их обработка (Java)\\Sem_4_Exceptions and their handling\\src\\Task_3_Name.txt");
        if (map != null) {
            writeData("D:\\Learning_5.0_D disk\\GeekBrains\\Java_GB\\Исключения в программировании и их обработка (Java)\\Sem_4_Exceptions and their handling\\src\\Task_33_Name.txt", map);
        } else {
            System.out.println("Ошибка при чтении данных.");
        }
    }

    public static void writeData(String filename, HashMap<String, Integer> map) {
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);

            for (String name : map.keySet()) {
                int value = map.get(name);
                writer.write(name + "=" + value + "\n");
            }
            writer.close();
            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл " + filename + ": " + e.getMessage());
        }
    }

    public static HashMap<String, Integer> readData(String filename) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Неверные данные в строке: " + line);
                }
                String name = parts[0];
                String value = parts[1];
                int valueInt;
                if (value.equals("?")) {
                    valueInt = name.length();
                } else {
                    try {
                        valueInt = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неверный формат числа: " + line);
                    }
                }
                map.put(name, valueInt);
            }
            scanner.close();
            return map;
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filename + " не найден.");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при чтении данных из файла " + filename + ": " + e.getMessage());
            return null;
        }
    }
}
