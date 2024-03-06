package Sem_6_OOP;
/*📌Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
📌Создать множество ноутбуков.
📌Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет ...
📌Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
📌Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/
import java.util.*;

// Класс для представления ноутбука
class Notebook {
    private String model;
    private int ram; // Объем оперативной памяти
    private int storage; // Объем жесткого диска
    private String os; // Операционная система
    private String color;

    // Конструктор для создания объекта ноутбука
    public Notebook(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    // Геттеры для доступа к полям ноутбука
    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                "GB, storage=" + storage +
                "GB, os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class NotebookStore {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Dell", 16, 512, "Windows 11", "Silver"));
        notebooks.add(new Notebook("MacBook", 32, 512, "macOS", "Gray"));
        notebooks.add(new Notebook("HP", 16, 1_024, "Windows 10", "Black"));
        notebooks.add(new Notebook("Asus", 8, 256, "Windows 10", "Blue"));
        notebooks.add(new Notebook("Lenovo", 16, 512, "Windows 11", "Black"));
        notebooks.add(new Notebook("Acer", 16, 1_024, "Windows 11", "Silver"));
        notebooks.add(new Notebook("Huawei", 8, 512, "Windows 10", "Gray"));

        // Фильтрация ноутбуков
        filterNotebooks(notebooks);
    }

    // Метод для фильтрации ноутбуков по критериям
    public static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> filters = new HashMap<>();
        filters.put(1, "RAM (8, 16, 32)");
        filters.put(2, "Storage (256, 512, 1024)");
        filters.put(3, "OS (Windows 10, Windows 11, macOS)");
        filters.put(4, "Color (Black, Gray, Silver)");

        Map<String, Integer> criteria = new HashMap<>();
        for (Map.Entry<Integer, String> entry : filters.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Введите цифру, соответствующую критерию:");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Считываем перевод строки

        if (choice == 1 || choice == 2) {
            System.out.println("Введите минимальное значение для " + filters.get(choice) + ":");
            int minVal = scanner.nextInt();
            for (Notebook notebook : notebooks) {
                if ((choice == 1 && notebook.getRam() >= minVal) ||
                        (choice == 2 && notebook.getStorage() >= minVal)) {
                    System.out.println(notebook);
                }
            }
        } else if (choice == 3 || choice == 4) {
            System.out.println("Введите критерий для " + filters.get(choice) + ":");
            String filterValue = scanner.nextLine().trim();
            for (Notebook notebook : notebooks) {
                if ((choice == 3 && notebook.getOs().equalsIgnoreCase(filterValue)) ||
                        (choice == 4 && notebook.getColor().equalsIgnoreCase(filterValue))) {
                    System.out.println(notebook);
                }
            }
        } else {
            System.out.println("Неверный выбор критерия.");
        }
        scanner.close();
    }
}

