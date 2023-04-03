package Rough;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfCharacters {

    static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 0;
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters("Ashutosh"));
    }
}
