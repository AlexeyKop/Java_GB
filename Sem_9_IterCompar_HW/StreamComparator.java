package Sem_9_IterCompar_HW;

import java.util.Comparator;

// Класс для сравнения потоков
public class StreamComparator {
    // Сравнение по названию группы
    public static class CompareByName implements Comparator<Group> {
        @Override
        public int compare(Group g1, Group g2) {
            return g1.getName().compareTo(g2.getName());
        }
    }

    // Сравнение по количеству учащихся в группе
    public static class CompareByNumberOfStudents implements Comparator<Group> {
        @Override
        public int compare(Group g1, Group g2) {
            return Integer.compare(g1.getNumberOfStudents(), g2.getNumberOfStudents());
        }
    }
}

