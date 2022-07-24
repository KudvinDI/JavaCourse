package Broadcast;

public class Interview extends BroadcastObject implements Profitable{

    private double pricePerSecond=0.5;
    public Interview(int length) {
        super(length);
    }

    @Override
    public double getPricePerSecond() {
        return pricePerSecond;
    }

    @Override
    public void setPricePerSecond(double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
    }

    @Override
    public double getTotalValue() {
        return programLength*60*pricePerSecond;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "pricePerSecond=" + pricePerSecond +
                ", programLength=" + programLength +
                '}';
    }
}
