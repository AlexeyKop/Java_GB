package Seminar_7_OOP_local.src;

public abstract class Product {
    private String name;    // наименование товара
    private double cost;    // стоимость товара

    public Product(String name, double cost) {  // конструктор класса Product (всегда public)
        this.name = name;
        this.cost = cost;
    }

    public String getName() {   // получить (читать) Name
        return name;
    }

    public void setName(String name) {  // установить (принять, записать) Name
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
