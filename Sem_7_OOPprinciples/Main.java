package Sem_7_OOPprinciples;

import java.util.ArrayList;
import java.util.List;

/*Задача 1 -Абстракция
📌Реализуйте класс Товар, содержащий данные о товаре, и Торговый Автомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)*/
/*Задача 2 -Инкапсуляция
📌Реализуйте конструкторы, get/set методы, постройте логику Торгового Автомата на основе кода сделанного
в предыдущем задании.*/
/*Задача 3 -Наследование
📌Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: Бутылка Воды),
сделайте интерфейсом Торговый Автомат и реализуйте класс какого-то одного типа Торгового Автомата
(пример: Продающий Бутылки Воды Автомат)*/
/*Задача 4 -Полиморфизм
📌Переопределите метод toString для Товара, запустите программу, после этого переопределите для наследника этотметод,
 после запуска обратите внимание на изменение поведения.
📌Создайте перегруженный метод выдачи товара Торговым Автоматом дополнив дополнительным входным параметром
(пример: getProduct(String name) выдающий товар по имени, создайте метод возвращающий товар по имени и какому-либо
параметру товара getProduct(String name, int volume)*/
public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleWater("1", 1, 1);
        Product product2 = new BottleWater("2", 2, 2);
        Product product3 = new BottleWater("3", 3, 3);
        Product product4 = new BottleWater("3", 3, 4);
        Product product5 = new BottleWater("5", 5, 5);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        // product.name  = "123";
        // System.out.println(product);
        VendingMachineBottleWater vendingMachine = new VendingMachineBottleWater();
        vendingMachine.initProducts(productList); // инициализируем список продуктов в vendingMachine
        System.out.println(vendingMachine.getProduct("3"));

    }

}
