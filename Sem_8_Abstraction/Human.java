package Sem_8_Abstraction;

public class Human extends Actor {

    public Human(String name) {     //конструктор, который вызывает конструктор суперкласса.
        super(name);
    }

    // переопределяем методы
    @Override
    public String getName() {   // переопределенный метод, который возвращает имя актера.
        return name;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder) { // переопределенный метод, который устанавливает флаг "делать заказ".
        super.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
