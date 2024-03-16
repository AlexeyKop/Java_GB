package Sem_9_IteratorComparator;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
