package Sem_9_IteratorComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;

    // конструктор создает группу студентов по готовому списку
    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    // конструктор создает группу студентов по пустому списку
    public StudentGroup() {
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
