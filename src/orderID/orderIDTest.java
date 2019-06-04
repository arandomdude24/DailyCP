package orderID;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class orderIDTest {
    orderID<Integer> n = new orderID<Integer>();

    @Test
    void atest() {
        n.record(5);
        assertEquals(n.getLast(1), 5);

        n.record(7);
        n.record(3);
        n.record(4);

        assertEquals(n.getLast(2),3);
        assertEquals(n.getLast(4), 5);
    }

}