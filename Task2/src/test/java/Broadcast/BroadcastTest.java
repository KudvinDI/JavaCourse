package Broadcast;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BroadcastTest {
    Broadcast broadcast;

    @BeforeEach
    public void setup(){
        broadcast = new Broadcast(60, "Broadcast", new Narrator("John", "https://"));
    }

    @Test
    public void addProgramTest1(){
       assertThrows(CapacityBroadcastException.class, ()->{
           broadcast.addProgram(new Interview(25));
           broadcast.addProgram(new Song(20, "Get Lucky", "Daft Punk"));
           broadcast.addProgram(new Song(20, "Get Lucky", "Daft Punk"));
       });
    }
    @Test
    public void addProgramTest2(){
        assertThrows(CapacityBroadcastException.class, ()->{
            broadcast.addProgram(new Interview(25));
            broadcast.addProgram(new Interview(25));
            broadcast.addProgram(new Song(5, "Get Lucky", "Daft Punk"));
        });
    }

}