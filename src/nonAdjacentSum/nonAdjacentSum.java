package nonAdjacentSum;
import java.lang.Math;
import java.util.Arrays;

/**
 * Ishaan Patel
 * 5/28/19
 * Daily Coding Problem #9 (Airbnb) (Hard)
 * Return the largest sum of non-adjacent numbers
 * Numbers can also be 0 and negative
 */
public class nonAdjacentSum {
    private int maxSumHelper(int[] lst) {
        if (lst == null || lst.length == 0)
            return 0;
        else if (lst.length == 1)
            return lst[0];
        else if (lst.length == 2)
            return Math.max(lst[0], lst[1]);
        return Math.max(lst[0] + maxSumHelper(Arrays.copyOfRange(lst, 2, lst.length)),
                    lst[0] + maxSumHelper(Arrays.copyOfRange(lst, 3, lst.length)));
    }

    public int maxSum(int[] lst) {
        if (lst == null || lst.length == 0)
            return 0;
        else if (lst.length == 1)
            return lst[0];
        else if (lst.length == 2)
            return Math.max(lst[0], lst[1]);

        return Math.max(maxSumHelper(lst),
                maxSumHelper(Arrays.copyOfRange(lst, 1, lst.length)));
    }
}
