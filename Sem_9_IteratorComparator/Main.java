package Sem_9_IteratorComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "aaa");
        Student student2 = new Student(2, "BBB");
        Student student3 = new Student(3, "AAA");
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student1);
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println("=================");
        System.out.println("Сортировка по ID");
        for (Student student : getSortedStudentGroup(studentGroup)) {
            System.out.println(student);
        }

        System.out.println("=================");
        System.out.println("Сортировка по Имени");

        for (Student student : getSortedStudentGroupByName(studentGroup)) {
            System.out.println(student);
        }
    }

    public static List<Student> getSortedStudentGroup(StudentGroup s) {
        // Создаем новый массив, и сортируем уже его, чтоб не трогать первоначальный список студентов.
        List<Student> studentList = new ArrayList<>(s.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public static List<Student> getSortedStudentGroupByName(StudentGroup studentGroup) {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComporator());
        return studentList;

        // можно сделать сравнение на месте через анонимный класс
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

    }
}
