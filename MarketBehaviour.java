package DZ.DZ_2;

import java.util.List;

/** MarketBehaviour (Поведение в магазине) */
public interface MarketBehaviour {
    void acceptToMarket(Actor actor); // входит в магазин

    void releaseFromMarket(List<Actor> actors); // выходит из магазина

    void update();// обновление состояиния магазина
}