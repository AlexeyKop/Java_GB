package Sem_9_IteratorComparator;

public class Student implements Comparable <Student>{
    ////private Integer studentId;
    private int studentId;
    private String name;

    // конструктор
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        ////return studentId.compareTo(o.getStudentId()); если бы мы в 6-й строке прописали: private Integer studentId;

        if(studentId > o.getStudentId())
            return 1;
        else if (studentId < o.getStudentId()) {
            return -1;
        }
        return 0;
    }
}
