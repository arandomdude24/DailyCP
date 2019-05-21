/**
 * Ishaan Patel
 * 5/20/19
 * Daily Coding Problem
 * Given a list of numbers and a value k, return if any 2
 * numbers from the list add up to k
 **/

public class sum {
    public static boolean isSum(int[] lst, int sum) {
        for (int x=0; x<lst.length; x++) {
            for (int y=x+1; y<lst.length; y++) {
                if (lst[x]+lst[y] == sum)
                    return true;
            }
        }
        return false;
    }

    public static void main(String [] args) {
        int[] test = new int[]{10, 15, 3, 7};

        System.out.println(isSum(test, 17)); //Should return true
        System.out.println(isSum(test, 100)); //Should return false
        System.out.println(isSum(test, 18)); //Should return true
    }
}
