/**
 * Ishaan Patel
 * 5/31/19
 * Daily Coding Problem #12 (Amazon)(Hard)
 * There is a stair case with N steps
 * You can go up either 1 or 2 steps
 * Return the number of ways you can climb the stair case
 * Order matters
 */
public class staircase {
    private int climbHelp(int N) {
        if (N == 0)
            return 1;
        else if (N < 0)
            return 0;
        return climbHelp(N-1) + climbHelp(N-2);
    }

    public int climb(int N) {
        if (N == 0)
            return 0;
        return climbHelp(N);
    }

    public int genericClimb(int N, int[] lst) {
        if (N == 0)
            return 0;
        return genericClimbHelp(N, lst);
    }

    private int genericClimbHelp(int N, int[] lst) {
        if (N == 0)
            return 1;
        else if (N < 0)
            return 0;
        int sum = 0;
        for (int i: lst)
            sum += genericClimbHelp(N-i, lst);
        return sum;
    }

    public static void main(String[] args) {
        staircase s = new staircase();
        System.out.println(s.climb(0)); //Should return 0
        System.out.println(s.climb(1)); //Should return 1
        System.out.println(s.climb(4)); //Should return 5

        System.out.println(s.genericClimb(4, new int[]{1, 2}));
        System.out.println(s.genericClimb(7, new int[]{1, 3, 5}));
    }
}

