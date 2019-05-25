/**
 * Ishaan Patel
 * 5/25/19
 * Daily Coding Problem #5 (Jane Street) (Medium)
 * Given cons(a,b) which constructs a pair
 * Implement car which returns the first element
 * Implement cdr which returns the last element
 * It should be noted that the Java implementation of this problem
 * is significantly harder since Java does not have a built in tuple function
 * This problem was clearly meant to be solved in Python
 */
public class pairElements {
    public static class Pair<E, F> {
        private E fst;
        private F snd;

        public Pair(E fst, F snd) {
            this.fst = fst;
            this.snd = snd;
        }

        public E getFst() {
            return fst;
        }

        public F getSnd() {
            return snd;
        }
    }

    public static int car(Pair<Integer, Integer> p) {
        return p.getFst();
    }

    public static int cdr(Pair<Integer, Integer> p) {
        return p.getSnd();
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> n = new Pair<Integer, Integer>(3, 4);

        System.out.println(car(n));
        System.out.println(cdr(n));

    }
}
