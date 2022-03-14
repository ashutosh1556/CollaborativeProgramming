package com.pratice.programming.india.string;

public class AnagramString {

    /*
      Clarifying Questions:
      1) Can you help me understand the definition of anagram?
      2) What if str is null or empty.
      3) Would you consider (ruchi, ichu) as Anagram, where length is not equal?
      4) Should we consider Case Sensitivity?
     */

    /**
     * TestCases:
     * checkAnagram("google","elgoog") - Positve
     * checkAnagram("google","gooogl") - Negative
     * checkAnagram("google","goo") - Negative
     * checkAnagram(null,null) - Null
     * checkAnagram("","") - Empty
     * checkAnagram("google","GOOGLE") - Case sensitive
     * checkAnagram("google","gooogle") - Repetitive Character
     */

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
                for (int j = 0; j < str1.length(); j++) {
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

    public static void main(String[] args) {
        AnagramString obj = new AnagramString();
        System.out.println(obj.checkAnagram("google", "google"));
    }
}
