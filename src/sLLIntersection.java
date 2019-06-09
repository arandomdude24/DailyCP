import java.util.*;

/**
 * This problem was asked by Google.
 * Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.
 * For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.
 * In this example, assume nodes with the same value are the exact same node objects.
 * Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
 */
public class sLLIntersection {
    static private Object intersection(LinkedList<Integer> one, LinkedList<Integer> two) {
        Object lrA;
        Object lrB;
        int indA = 0;
        int indB = 0;

        //Sets the two linked lists on the same pace
        if (one.size() > two.size())
            indA += one.size() - two.size();
        else if (two.size() > one.size())
            indB += two.size() - one.size();

        //Checks for the intersecting node
        while (indA < one.size()) {
            lrA = one.get(indA);
            lrB = two.get(indB);
            if (lrA.equals(lrB))
                return lrA;
            indA++;
            indB++;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();

        first.add(3);
        first.add(7);
        first.add(5);
        first.add(8);
        first.add(10);

        second.add(99);
        second.add(1);
        second.add(8);
        second.add(10);

        System.out.println(intersection(first, second)); //Should return 8

    }
}
