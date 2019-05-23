package missingNatural;

import static org.junit.jupiter.api.Assertions.*;

class missingNaturalTest {

    @org.junit.jupiter.api.Test
    void missing() {
        int[] test = new int[]{3, 4, -1, 1};
        assertEquals(missingNatural.missing(test), 2);

        int[] tester = new int[]{1, 2, 0};
        assertEquals(missingNatural.missing(tester), 3);

        int[] more = new int[]{3, 4, 3, 4, 2};
        assertEquals(missingNatural.missing(more), 1);

        int[] again = new int[]{1, 10, -3, 2, 1};
        assertEquals(missingNatural.missing(again), 3);
    }
}