package Seminar_7_OOP_local.src;

public interface VendingMachine {

//    void initProducts (List<Product> productList); // метод инициализурует наш список с продуктами
//    // (в нашем случае выполняет роль конструктора)

    Product getProduct(String name);

    Product getProduct(String name, double volume);
}
