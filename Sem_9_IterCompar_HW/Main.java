package Sem_9_IterCompar_HW;

public class Main {
    public static void main(String[] args) {
        StreamService service = new StreamService();
        Stream stream = new Stream();

        // Сортировка по названию группы
        service.sortByGroupName(stream);

        // Сортировка по количеству учащихся
        service.sortByNumberOfStudents(stream);
    }
}

