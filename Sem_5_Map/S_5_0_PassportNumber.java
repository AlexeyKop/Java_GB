package Sem_5_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Задание No0
📌Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
📌Вывести данные по сотрудникам с фамилией Иванов.*/
public class S_5_0_PassportNumber {
    public static void main(String[] args) {
        // Map<Integer, String> passportData = new LinkedHashMap<>();  // LinkedHashMap сохраняет порядок добавления
                                                                    // при выводе элементов на консоль
        Map<Integer, String> passportData = new TreeMap<>();  //сортирует значения по ключам
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");

        String targetName = "Иванов";

        for(Integer passportNum : passportData.keySet()) {
            String name = passportData.get(passportNum);
            if (name.equals(targetName)) {
                System.out.println("Номер паспорта: " + passportNum + ", Фамилия: " + name);
            }
        }

    }
}
