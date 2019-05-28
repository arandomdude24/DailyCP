package nonAdjacentSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nonAdjacentSumTest {

    @Test
    void maxSum() {
        int[] empty = new int[]{};
        int[] one = new int[]{2};
        int[] two = new int[]{4, 8};
        int[] test = new int[]{2, 4, 6, 2, 5};
        int[] another = new int[]{5, 1, 1, 5};
        nonAdjacentSum n = new nonAdjacentSum();

        assertEquals(n.maxSum(empty), 0);
        assertEquals(n.maxSum(one), 2);
        assertEquals(n.maxSum(two), 8);
        assertEquals(n.maxSum(test), 13);
        assertEquals(n.maxSum(another), 10);
    }
}