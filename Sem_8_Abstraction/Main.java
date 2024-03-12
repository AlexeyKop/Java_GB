package Sem_8_Abstraction;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivanko");
        Human human2 = new Human("Pedro");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
