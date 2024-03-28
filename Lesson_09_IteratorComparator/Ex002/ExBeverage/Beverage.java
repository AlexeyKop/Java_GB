package Lesson_09.Ex002.ExBeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public abstract class Beverage implements Iterator<Ingredient> {
    List<Ingredient> components;    // коллекция
    int index;
    public Beverage() {   // конструктор
        components = new ArrayList<>();
        index = 0;
    }

    // метод добавления
    public void addComponent(Ingredient component){
        components.add(component);
    }

    // реализация итератора
    @Override
    public boolean hasNext() {
        return index < components.size();
    }
    
    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
