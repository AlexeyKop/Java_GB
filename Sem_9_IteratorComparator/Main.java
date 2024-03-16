package Sem_9_IteratorComparator;

import java.util.ArrayList;
import java.util.Collections;
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

        for (Student student : getSortedStudentGroup(studentGroup)) {
            System.out.println(student);
        }

        System.out.println("=================");

        for (Student student : getSortedStudentGroupByName(studentGroup)) {
            System.out.println(student);
        }
    }

    public static List<Student> getSortedStudentGroup(StudentGroup s) {
        List<Student> studentList = new ArrayList<>(s.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public static List<Student> getSortedStudentGroupByName(StudentGroup studentGroup) {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComporator());
        return studentList;
    }
}
