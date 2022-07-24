package Broadcast;

public class Advertisement extends BroadcastObject implements Profitable {
    private double pricePerSecond = 5;

    public Advertisement(int length) {
        super(length);
    }

    @Override
    public double getPricePerSecond() {
        return pricePerSecond*60;
    }

    @Override
    public void setPricePerSecond(double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
    }

    @Override
    public double getTotalValue() {
        return pricePerSecond*60*programLength;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "pricePerSecond=" + pricePerSecond +
                ", programLength=" + programLength +
                '}';
    }
}
