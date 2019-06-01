import java.util.HashMap;

/**
 * Ishaan Patel
 * 6/1/2019
 * Daily Coding Problem #13 (Amazon)(Hard)
 * Given an integer k and string s
 * Find the length of the longest substring that contains
 * at most k distinct characters
 */
public class uniqueSubString {
    private int sub(int k, String s) {

        if (k == 0 || s.equals(""))
            return 0;
        else if (s.length() == 1)
            return 1;

        String longest = "";
        String second = "";
        HashMap<Character, Integer> dict = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            dict.clear();
            for (int j=i; j<s.length(); j++) {
                if (!(dict.containsKey(s.charAt(j))))
                    dict.put(s.charAt(j), 1);
                else {
                    int temp = dict.get(s.charAt(j));
                    dict.replace(s.charAt(j), temp, temp + 1);
                }
                if (dict.size() <= k)
                    second += s.charAt(j);
                else if (second.length() > longest.length()) {
                    longest = second;
                    second = "";
                } else
                    second = "";
            }
        }
        return longest.length();
    }

    public static void main(String[] args) {
        uniqueSubString n = new uniqueSubString();

        System.out.println(n.sub(0, "sfsdrfw"));
        System.out.println(n.sub(5, ""));
        System.out.println(n.sub(79, "x"));
        System.out.println(n.sub(2, "abcba"));
    }
}
