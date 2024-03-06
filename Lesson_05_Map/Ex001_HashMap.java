package Lesson_05_Map;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); 
        db.put(2, "два"); 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // null, получение значения по указанному ключу.
        db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true, проверка наличия значения
        System.out.println(db.containsValue(1)); // false, проверка наличия значения
        System.out.println(db.containsKey("один")); // false, проверка наличия ключа
        System.out.println(db.containsKey(1)); // true, проверка наличия ключа
        System.out.println(db.keySet());    // возвращает множество ключей
        System.out.println(db.values());    // возвращает набор значений

    }
}