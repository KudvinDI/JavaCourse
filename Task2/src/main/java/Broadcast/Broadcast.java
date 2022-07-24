package Broadcast;


import java.util.ArrayList;

public class Broadcast {
    private final int broadcastLength;
    private final ArrayList<BroadcastObject> broadcastProgram;
    private final Narrator narrator;
    private final String broadcastName;

    public Narrator getNarrator() {
        return narrator;
    }

    public Broadcast(int broadcastLength, String broadcastName, Narrator narrator) {
        this.broadcastLength = broadcastLength;
        broadcastProgram = new ArrayList<>();
        this.narrator = narrator;
        this.broadcastName = broadcastName;
    }
    public double getBroadcastIncome(){
        return broadcastProgram.stream()
                .map(x->(Profitable) x)
                .mapToDouble(x-> ((Profitable) x).getTotalValue()).sum();

    }
    public void addProgram(BroadcastObject broadcastObject) throws CapacityBroadcastException {

        int currentBroadcastLength = broadcastProgram.stream()
                .mapToInt(BroadcastObject::getProgramLength).sum();
        int profitableProgramLength = broadcastProgram.stream()
                .filter(x -> x instanceof Profitable)
                .mapToInt(BroadcastObject::getProgramLength).sum();

        if (currentBroadcastLength + broadcastObject.getProgramLength() < broadcastLength) {

            boolean isPayableProgramLengthSuitable = broadcastObject.getProgramLength()
                    + profitableProgramLength <= broadcastLength / 2;

            if (!(broadcastObject instanceof Profitable) || isPayableProgramLengthSuitable) {
                broadcastProgram.add(broadcastObject);
            }
            else throw new CapacityBroadcastException();
        }else throw new CapacityBroadcastException();
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(broadcastName).append("\n");
        broadcastProgram.forEach(broadcastObject -> stringBuilder.append(broadcastObject.toString()).append("\n"));
        return stringBuilder.toString();
    }
}
