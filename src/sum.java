/**
 * Ishaan Patel
 * 5/20/19
 * Daily Coding Problem
 * Given a list of numbers and a value k, return if any 2
 * numbers from the list add up to k
 **/

public class sum {
    public static boolean isSum(int[] lst, int sum) {
        int indFirst = 0;
        int indSecond = 0;
        int first = lst[0];
        int second = lst[1];

        while (indFirst < lst.length-1) {
            if (first+second == sum)
                return true;
            else if (indSecond < lst.length-1) {
                indSecond++;
                second = lst[indSecond];
            } else {
                indFirst++;
                first = lst[indFirst];
            }
        }
        return false;
    }

    public static void main(String [] args) {
        int[] test = new int[]{10, 15, 3, 7};

        System.out.println(isSum(test, 17)); //Should return true
        System.out.println(isSum(test, 100)); //Should return false
    }
}
