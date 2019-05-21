import java.util.Arrays;

/**
 * Ishaan Patel
 * 5/21/19
 * Daily Coding Problem #2 (Uber) (Hard)
 * Given an array of integers, return a new array
 * where each element is the product of all numbers in the
 * original array except the one at the same index
 */
public class partial_product {
    public static int[] pProduct(int[] original) {
        int product = 1;
        int[] changed = new int[original.length];

        for (int x: original)
            product *= x;
        for (int i=0; i<changed.length; i++)
            changed[i] = product/original[i];
        return changed;
    }

    public static void main(String [] args) {
        int[] test = new int[]{1, 2, 3, 4, 5};
        int[] another = new int[]{3, 2, 1};

        final long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(pProduct(test)));
        System.out.println(Arrays.toString(pProduct(another)));

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime));

    }
}
