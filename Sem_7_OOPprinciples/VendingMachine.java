package Sem_7_OOPprinciples;

import java.util.List;

// public class VendingMachine {
public interface VendingMachine { // интерфейс - перечесление методов, которые должны реализовать нашы классы-наследники
    // private List<Product> productList; // в interface не могут быть приватных переменных

//    public VendingMachine(List<Product> productList) { // конструктор со списком List<Product>
//        this.productList = productList;
//    }
//
//    public VendingMachine() { // пустой конструктор
//    }

    void initProducts (List<Product> productList); // метод инициализурует наш список с продуктами
                                                    // (в нашем случае выполняет роль конструктора)
//    {
//        this.productList = productList;
//    }

    Product getProduct(String name);     // будет возвращать продукт из нашего списка по имени
//    {
//        for (Product product : productList)
//            if(product.getName().equals(name))  // перебираем List<Product> через .get() и
//                                                //стравниваем ч/з .equals(name) с name, который нам передали
//                return product;
//        return null;
//    }
}
