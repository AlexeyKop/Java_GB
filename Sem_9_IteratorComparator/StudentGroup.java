package Sem_9_IteratorComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) { // конструктор создает группу студентов по готовому списку
        this.studentList = studentList;
    }

    public StudentGroup() {     // конструктор создает группу студентов по пустому списку
        studentList = new ArrayList<>();
    }

    // метод по добавлению новых студентов
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // метод возвращает весь список наших студентов

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
