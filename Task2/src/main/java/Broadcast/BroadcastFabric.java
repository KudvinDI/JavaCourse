package Broadcast;

public abstract class BroadcastFabric {
    public static Broadcast createBroadcast(int broadcastLength, String broadcastName, Narrator narrator){
            Broadcast broadcast = new Broadcast(broadcastLength, broadcastName, narrator);
            narrator.addBroadcastToNarrator(broadcast);
            return broadcast;
        }
    }

