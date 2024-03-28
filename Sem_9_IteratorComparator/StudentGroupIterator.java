package Sem_9_IteratorComparator;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    // переменная хранит список студентов
    private List<Student> studentList;
    private int count = 0;


    // принимаем его через конструктор
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
    }

    // в стандартном интерфейсе: Iterator есть стандартные методы: hasNext(), next().
    @Override
    public boolean hasNext() {  // проверяет наличие следующего элемента
        return count < studentList.size();  // если меньше вернет true, если больше - false.
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        return studentList.get(count++);  // возвращает элемент и увеличивает индекс на 1.
    }

    // удаляем текущий элемент
    @Override
    public void remove() {
        studentList.remove(count);
    }
}
