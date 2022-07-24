package main;

import Broadcast.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    public void run(){
        Narrator JohnSmith = new Narrator("John Smith", "https://myCV", 3);
        Broadcast chillBroadcast = BroadcastFabric.createBroadcast(120, "Broadcast", JohnSmith);
        try {
            chillBroadcast.addProgram(new Interview(30));
            chillBroadcast.addProgram(new Song(5, "Get Lucky", "Daft Punk"));
            chillBroadcast.addProgram(new Song(5, "Californication", "RedHotChiliPapers"));
            chillBroadcast.addProgram(new Song(5, "Come As You Are", "Nirvana"));
            chillBroadcast.addProgram(new Advertisement(10));

        }catch (CapacityBroadcastException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println(chillBroadcast.getNarrator());
        System.out.println(chillBroadcast);

    }
}
