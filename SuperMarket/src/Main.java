import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehavior;

public class Main {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // OrdinaryClient client1 = new OrdinaryClient("Boris");
        // OrdinaryClient client2 = new OrdinaryClient("Dasha");
        // SpecialClient client3 = new SpecialClient("Fedor", 1101);
        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market = new Market();
        iActorBehavior item1 = new OrdinaryClient("Boris");
        iActorBehavior item2 = new SpecialClient("Fedor", 1101);
        iActorBehavior item3 = new OrdinaryClient("Dasha");

        iActorBehavior item4 = new ActionClient("Alex", "CashBack");
        iActorBehavior item5 = new ActionClient("Kate", "CashBack");
        iActorBehavior item6 = new ActionClient("Dmitry", "CashBack");
        iActorBehavior item7 = new ActionClient("Den", "CashBack");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);

        market.acceptToMarket(item4);
        // Возврат товара четвертым клиентом (номер товара 003)
        item4.getActor().returnOrder(003);
        System.out.println("производится возврат");

        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);

        market.update();
    }
}