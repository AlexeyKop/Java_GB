package Sem_8_Abstraction;

abstract class Actor implements ActorBehavoir{ // Абстрактный класс, который реализует интерфейс ActorBehavoir.
    protected String name;
    protected boolean isMakeOrder; // protected: доступен в пределах класса и его наследников.
    protected boolean isTakeOrder;

    public Actor (String name) { // конструктор, который инициализирует имя, флаги "делать заказ" и "брать заказ".
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    public abstract String getName();      // абстрактный метод, который возвращает имя актера.

}
