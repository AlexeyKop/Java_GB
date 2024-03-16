package Lesson_09.Ex004;

import Lesson_09.Ex004.ExBeverage.*;

import java.beans.Beans;
import java.util.Iterator;


// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("ВодаВода"));
        latte.addComponent(new Вeans("ЗернаЗерна"));
        latte.addComponent(new Milk("МолокоMilk"));

//        Iterator<Ingredient> iterator = latte;
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
