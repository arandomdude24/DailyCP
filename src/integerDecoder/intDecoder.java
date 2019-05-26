package integerDecoder;

import java.util.HashMap;

/**
 * Ishaan Patel
 * 5/26/19
 * Daily Coding Problem #7 (Facebook) (Medium)
 * Given a one-to-one letter to number mapping
 * Given an encoded message
 * Count the number of ways it can be decoded
 */
public class intDecoder {

    public static HashMap<Integer, String> makeDict() {
        HashMap<Integer, String> dict = new HashMap<Integer, String>();
        for (int i=1; i <= 26; i++) {
            int n = i+96;
            dict.put(i, Character.toString((char)n));
        }
        return dict;
    }

    public static int decode(String s, HashMap<Integer,String> d, String res) {
        if (s.isEmpty())
            return 1;
        else if (s.length() >= 2 && (Character.getNumericValue(s.charAt(0))
                + Character.getNumericValue(s.charAt(1)) <= 26)) {
            int sum = Character.getNumericValue(s.charAt(0) + s.charAt(1));
            String first = d.get(Character.getNumericValue(s.charAt(0)));
            String second = d.get(sum);
            return decode(s.substring(1), d, res+first) +
                    decode(s.substring(2), d, res+second);
        }
        else
            return decode(s.substring(1), d, res+d.get((int)s.charAt(0)));
    }
}
