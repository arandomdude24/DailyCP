import java.util.ArrayList;

/**
 * This problem was asked by Snapchat.
 * Given an array of time intervals (start, end) for classroom lectures
 * (possibly overlapping), find the minimum number of rooms required.
 * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */
public class minClassroom {
    //A brute force solution that checks every single minute
    private static int classrom(int[][] lst) {
        int min = lst[0][0];
        int max = -1;
        int result = 0;

        //Gets the earliest time classes start
        //And the latest time classes end
        for (int[] x: lst) {
            for (int y: x) {
                if (y < min)
                    min = y;
                if (y > max)
                    max = y;
            }
        }

        //Checks how many classrooms are needed each minute
        //The highest number is our answer
        for (int i=min; i<=max; i++) {
            int temp = 0;
            for (int[] x: lst) {
                if (i >= x[0] && i <= x[1])
                    temp++;
            }
            if (temp > result)
                result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{30, 75}, {0, 50}, {60, 150}};
        System.out.println(classrom(test)); //Should return 2
    }
}
