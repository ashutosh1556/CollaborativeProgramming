package com.pratice.programming.india.datastructures.string;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "abac";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int len = 0; i + len < charArray.length; len++) {
                if (isPalindrome(charArray, i, len) && len + 1 > maxLen) {
                    maxLen = len + 1;
                    start = i;
                }
            }
        }
        System.out.println(maxLen);

        return s.substring(start, start + maxLen);
    }

    public static boolean isPalindrome(char[] charArray, int start, int len) {
        while (len > 0) {
            if (charArray[start] != charArray[start + len]) {
                return false;
            }

            start++;
            len -= 2;
        }

        return true;
    }
}



