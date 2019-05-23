package missingNatural;

/**
 * Ishaan Patel
 * 5/23/19
 * Daily Coding Problem #4 (Stripe) (Hard)
 * Given an array of integers, find the first missing positive integer
 * Code must be in linear time and constant space
 * Array an contain duplicates and negatives
 * The input array can be modified
 */
public class missingNatural {
    public static int missing(int[] lst) {
        int low = lst[0];
        int second = lst[1];

        for (int x: lst) {
            if (x > 0 && x<low) {
                second = low;
                low = x;
            }
            if (x > 0 && x>low && x<second)
                second = x;
        }

        if (second-low == 1 && low == 1)
            return second+1;
        else if (second-low == 1 && low != 1)
            return 1;
        return low+1;
    }
}
