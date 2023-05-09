package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavior {
    void acceptToMarket(iActorBehavior actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
