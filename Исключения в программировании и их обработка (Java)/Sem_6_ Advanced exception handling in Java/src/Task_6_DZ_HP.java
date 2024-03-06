
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_6_DZ_HP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в следующем формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String input = scanner.nextLine();

        try {
            processInput(input);
        } catch (InputFormatException e) {
            System.out.println("Ошибка формата ввода: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void processInput(String input) throws InputFormatException, IOException {
        String[] data = input.split(" ");
        if (data.length != 6) {
            throw new InputFormatException("Неверное количество данных");
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            throw new InputFormatException("Неверный формат номера телефона");
        }
        char gender = data[5].charAt(0);
        if (gender != 'f' && gender != 'm') {
            throw new InputFormatException("Неверный пол");
        }

        // Записываем данные в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true))) {
            writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        }
    }

    static class InputFormatException extends Exception {
        public InputFormatException(String message) {
            super(message);
        }
    }
}


