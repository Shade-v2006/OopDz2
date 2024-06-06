package DZ.DZ_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Вася");
        Human human2 = new Human("Петя");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}