package Sem_6_OOP;

import java.util.Objects;

/*Задание No3
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
(или другие параметры на ваше усмотрение). */
public class ClassCat {
    private String name;
    private int age;
    private String color;

    public ClassCat(String name, int age, String color) { // конструктор класса public class ClassCat

        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String getName(){    // геттеры (метод для получения значения) используются для доступа к полям
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

    public void  setName(String name){    // cеттеры (метод для установки значения) используются для доступа к полям
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override //Эта аннотация указывает, что следующий метод переопределяет метод родительского класса или интерфейса.
    public int hashCode() {

        return Objects.hash(name, age,color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ClassCat cat = (ClassCat) obj;

        return name.equals(cat.name) &&
                age == cat.age &&
                color.equals(cat.color);
    }

    @Override
    public String toString() {
        return "ClassCat{" +
                "name='" + name + '\'' +
                "Возраст: " + age +
                ", color='" + color + '\'' +
                '}';
    }
}
