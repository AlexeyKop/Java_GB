package Lesson_09.Ex002.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override   // переопределение метода toString
    public String toString() {
        return brand;
    }
}
