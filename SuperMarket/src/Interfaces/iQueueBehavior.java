package Interfaces;

import Classes.Actor;

public interface iQueueBehavior {
    void takeInQueue(iActorBehavior actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
