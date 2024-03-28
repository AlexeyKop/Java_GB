package Sem_9_IterCompar_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Класс StreamService для работы с потоками
public class StreamService {
    // Метод сортировки списка потоков по названию группы
    public void sortByGroupName(Stream stream) {
        List<Group> groups = new ArrayList<>();
        // Пройдемся по всем группам в потоке и добавим их в список
        for (Group group : stream) {
            groups.add(group);
        }

        // Выводим  список  групп
        System.out.println("Список групп:");
        for (Group group : groups) {
            System.out.println(group.getName() + " - " + group.getNumberOfStudents() + " учеников");
        }
        System.out.println();

        // Создаем экземпляр Comparator для сравнения по названию группы
        StreamComparator.CompareByName comparator = new StreamComparator.CompareByName();
        // Сортируем список по названию группы
        Collections.sort(groups, comparator);

        // Выводим отсортированный список по названию группы
        System.out.println("Сортировка по названию группы:");
        for (Group group : groups) {
            System.out.println(group.getName() + " - " + group.getNumberOfStudents() + " учеников");
        }
        System.out.println();
    }

    // Метод сортировки списка потоков по количеству учащихся в группе
    public void sortByNumberOfStudents(Stream stream) {
        List<Group> groups = new ArrayList<>();
        // Пройдемся по всем группам в потоке и добавим их в список
        for (Group group : stream) {
            groups.add(group);
        }

        // Создаем экземпляр Comparator для сравнения по количеству учащихся
        StreamComparator.CompareByNumberOfStudents comparator = new StreamComparator.CompareByNumberOfStudents();
        // Сортируем список по количеству учащихся в группе
        Collections.sort(groups, comparator);

        // Выводим отсортированный список по количеству учащихся
        System.out.println("Сортировка по количеству учащихся:");
        for (Group group : groups) {
            System.out.println(group.getName() + " - " + group.getNumberOfStudents() + " учеников");
        }
        System.out.println();
    }
}


