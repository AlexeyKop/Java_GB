package Sem_7_OOPprinciples;

public abstract class Product {
    private String name;    // наименование продукта
    private double cost;    // цена продукты

    public Product(String name, double cost) { // конструктор всегда публичный
        this.name = name;
        this.cost = cost;
    }

    public String getName() {   // получить имя
        return name;
    }

    public void setName(String name) { // задать (установить) имя
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
