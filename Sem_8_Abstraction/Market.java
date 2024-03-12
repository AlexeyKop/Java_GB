package Sem_8_Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> queue = new ArrayList<>();  // очередь - список наших посетителей магазина

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor); // ставим в очередь
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);  // удаляем его из очереди
        }
    }

    @Override
    public void update() {
        takeOrders();   // проходим по списку и собираем заказы
        giveOrders();   // проходим по списку и отдаем заказы
        releaseFromQueue();  // проходим по списку и выгоняем из очереди
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);   // добавляем его в очередь
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder()) {  // если актор НЕ делал свой заказ
                actor.setMakeOrder(true);  // то он делает заказ
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if(actor.isMakeOrder()) {   // если актер сделал заказ
                actor.setTakeOrder(true);  // то мы его ему отдаем
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {    // метод - выгоняем людей из магазина
        List<Actor> releasedActors = new ArrayList<>(); // создаем отдельный список
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {  // если актор получил заказ
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }

}
