package Sem_10_Generics;

import java.awt.*;
import java.time.LocalDate;

public interface UserService<T> {
    List<T> getAll();

    void create (String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
