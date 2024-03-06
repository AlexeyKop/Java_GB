package Sem_5_Map;

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        // Проверяем, содержит ли книга уже запись с таким именем
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> numbers = phoneBook.get(name); // Если да, получаем список номеров для этого имени
            numbers.add(phoneNum); // Добавляем новый номер в список
            phoneBook.put(name, numbers); // Обновляем запись в книге
        } else {
            ArrayList<Integer> numbers = new ArrayList<>(); // Если записи с таким именем еще нет, создаем новый список номеров
            numbers.add(phoneNum); // Добавляем в него новый номер
            phoneBook.put(name, numbers); // Добавляем запись в книгу
        }


    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        // Проверяем, содержит ли книга запись с таким именем
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name); // Если да, возвращаем список номеров для этого имени
        } else {
            return new ArrayList<>(); // Если записи с таким именем нет, возвращаем пустой список
        }

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже

        return phoneBook; // Возвращаем всю телефонную книгу

    }
}
// Не удаляйте этот класс - он нужен для

public class S_5_4_PhoneBook {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}