package com.pratice.programming.canada.strings;

public class IsAnagram {


    public static void main(String[] args) {
        String str1 = "uchi";
        String str2 = "chip";
        IsAnagram anagram = new IsAnagram();
        System.out.println(anagram.isAnagram3(str1, str2));
    }

    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    boolean isAnagram3(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            System.out.println("inside for loop " + c);
            int index = anagram.indexOf(c);
            System.out.println("index is =" + index);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1); //uc cu

                System.out.println(anagram);
                /*anagram = cu

                */
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    boolean isAnagram2(String str1, String str2) {
        boolean isAnagram = false;

        if (str1 == null || str2 == null) return false;
        else if (str1.length() != str2.length()) return false;
        else if (str1.isEmpty() || str2.isEmpty()) return false;
        else {

            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();
            int str1Ascii = -1;
            int str2Ascii = -1;
            for (int i = 0; i < str1Arr.length; i++) {
                str1Ascii += str1Arr[i];
                str2Ascii += str2Arr[i];
            }
            if (str1Ascii == str2Ascii)
                isAnagram = true;
            return isAnagram;
        }
    }


}



