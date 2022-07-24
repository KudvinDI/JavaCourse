package Broadcast;

public class CapacityBroadcastException extends Exception{
    public CapacityBroadcastException() {
        super("Capacity of Broadcast met");
    }

    public CapacityBroadcastException(String message) {
        super(message);
    }

    public CapacityBroadcastException(Throwable cause) {
        super(cause);
    }
}
