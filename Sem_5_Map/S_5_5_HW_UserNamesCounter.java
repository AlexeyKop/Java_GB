package Sem_5_Map;

import java.util.HashMap;

public class S_5_5_HW_UserNamesCounter {
    public static void main(String[] args) {
        HashMap<String, Integer> nameCounts = new HashMap<>();

        // Если аргументы не предоставлены, используем имена по умолчанию
        if (args.length == 0) {
            args = new String[]{"Elena", "Elena", "Elena", "Ivan", "Ivan"};
        }

        // Проходим по каждому имени в аргументах
        for (String name : args) {
            // Если имя уже есть в HashMap, увеличиваем количество на 1
            if (nameCounts.containsKey(name)) {
                int count = nameCounts.get(name);
                nameCounts.put(name, count + 1);
            } else {
                // Если имя встречается впервые, добавляем его в HashMap с начальным количеством 1
                nameCounts.put(name, 1);
            }
        }

        // Выводим результаты
        System.out.println(nameCounts);
    }
}
