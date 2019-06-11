import java.util.ArrayList;
import java.util.Arrays;

/**
 * This problem was asked by Microsoft.
 * Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
 * If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.
 * For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond",
 * return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
 */
public class makeSentence {
    private static String[] remake(String[] lst, String s) {
        int ind = 0;
        String temp = "";
        ArrayList<String> result = new ArrayList<>();

        //Checks if the sub sequence matches any word in the dictionary
        while (ind < s.length()) {
            temp += s.charAt(ind);
            for (String x: lst) {
                if (x.equals(temp)) {
                    result.add(x);
                    temp = "";
                }
            }
            ind++;
        }

        //If there is no possible reconstruction
        if (!(temp.isEmpty()))
            return null;

        //Formats the answer into a String array
        String[] answer = new String[result.size()];
        for (int i=0; i<result.size(); i++)
            answer[i] = result.get(i);

        return answer;
    }
    public static void main(String[] args) {
        String[] test = new String[]{"quick", "brown", "the", "fox"};
        String atest = "thequickbrownfox";

        String[] another = new String[]{"bed", "bath", "bedbath", "and", "beyond"};
        String more = "bedbathandbeyond";

        System.out.println(Arrays.toString(remake(test, atest)));
        System.out.println(Arrays.toString(remake(another, more)));

    }
}
