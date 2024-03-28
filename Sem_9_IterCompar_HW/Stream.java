package Sem_9_IterCompar_HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс, представляющий учебную группу
class Group {
    private String name;
    private int numberOfStudents;

    public Group(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

// Класс Stream, содержащий список учебных групп и реализующий интерфейс Iterable
public class Stream implements Iterable<Group> {
    private List<Group> groups;

    public Stream() {
        groups = new ArrayList<>();
        // Добавим 5 учебных групп с количеством учеников
        groups.add(new Group("Физика", 20));
        groups.add(new Group("Химия", 15));
        groups.add(new Group("Математика", 18));
        groups.add(new Group("Литература", 22));
        groups.add(new Group("История", 17));
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}
