package Seminar_7_OOP_local.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }

        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Чай" , 50, 150, 80));
        hotDrinks.add(new HotDrink("Кофе", 60,75, 90));
        hotDrinks.add(new HotDrink("Какао", 70, 100,70));

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(hotDrinks);

        // Получение напитка по имени
        HotDrink drinkByName = (HotDrink) machine.getProduct("Чай");
        System.out.println(drinkByName);

        // Получение напитка по имени и объему
        HotDrink drinkByNameAndVolume = (HotDrink) machine.getProduct("Кофе", 75);
        System.out.println(drinkByNameAndVolume);

        // Получение напитка по имени, объему и температуре
        HotDrink drinkByNameVolumeAndTemperature = (HotDrink) machine.getProduct("Какао", 100, 70);
        System.out.println(drinkByNameVolumeAndTemperature);


    }

}