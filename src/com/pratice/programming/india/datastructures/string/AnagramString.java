package com.pratice.programming.india.datastructures.string;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


    /*
      Clarifying Questions:
      1) Can you help me understand the definition of anagram?
      2) What if str is null or empty.
      3) Would you consider (ruchi, ichu) as Anagram, where length is not equal?
      4) Should we consider Case Sensitivity?
     */

/**
 * Clarifying Questions:
 * 1) Can you help me understand the definition of anagram?
 * 2) What if str is null or empty.
 * 3) Would you consider (ruchi, ichu) as Anagram, where length is not equal?
 * 4) Should we consider Case Sensitivity?
 * <p>
 * TestCases:
 * checkAnagram("google","elgoog") - Positve
 * checkAnagram("google","gooogl") - Negative
 * checkAnagram("google","goo") - Negative
 * checkAnagram(null,null) - Null
 * checkAnagram("","") - Empty
 * checkAnagram("google","GOOGLE") - Case sensitive
 * checkAnagram("google","gooogle") - Repetitive Character
 */

public class AnagramString {

    public static void main(String[] args) {
        AnagramString obj = new AnagramString();
        System.out.println(obj.isAnagram("R", "R"));
    }

    public boolean isAnagram(String s, String t) {
        boolean result = true;
        if (s != null || t != null) {
            int str1Length = s.length();
            int str2Length = t.length();

            if (str1Length != str2Length)
                result = false;
            else {
                Map<Character, Integer> map = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.toLowerCase().charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }

                for (int i = 0; i < t.length(); i++) {
                    char ch = t.toLowerCase().charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
                }

                Set<Character> keys = map.keySet();

                for (Character ch : keys) {
                    if (map.get(ch) != 0) result = false;
                }
            }
        }
        return result;
    }

    boolean checkAnagram(String str1, String str2) {
        boolean isAnagram = false;
        int lastIndexOfChar = -1;

        if (str1 == null || str2 == null)
            return false;
        else if (str1.isEmpty() || str2.isEmpty())
            return true;
        else if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j) && lastIndexOfChar != j) { // str1 = rru, str2 = urr
                        isAnagram = true;
                        lastIndexOfChar = j; // 1, 2
                        break;
                    }
                }

            }
        }
        return isAnagram;
    }
}
