package Broadcast;

import java.util.ArrayList;

public class Narrator {
    private final String name;
    private int experience;
    private final String urlCV;
    private final ArrayList<Broadcast> broadcasts;


    public Narrator(String name,  String urlCV) {
        this.name = name;
        this.urlCV = urlCV;
        broadcasts = new ArrayList<>();
    }
    public Narrator(String name, String urlCV, int experience) {
        this(name, urlCV);
        this.experience = experience;
    }

    public ArrayList<Broadcast> getBroadcasts() {
        return broadcasts;
    }


    public void addBroadcastToNarrator(Broadcast broadcast){
        broadcasts.add(broadcast);
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getUrlCV() {
        return urlCV;
    }

    @Override
    public String toString() {
        return "Narrator{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", urlCV='" + urlCV + '\'' +
                '}';
    }
}
