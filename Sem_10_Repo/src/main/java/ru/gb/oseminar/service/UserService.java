package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
