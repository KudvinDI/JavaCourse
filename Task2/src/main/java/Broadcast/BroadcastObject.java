package Broadcast;

public abstract class BroadcastObject {
    public int programLength;

    public BroadcastObject(int programLength) {
        this.programLength = programLength;
    }


    public int getProgramLength() {
        return programLength;
    }

    @Override
    public String toString() {
        return "BroadcastObject{" +
                "programLength=" + programLength +
                '}';
    }
}
