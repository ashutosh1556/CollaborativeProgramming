package com.pratice.programming.india.string;

import java.lang.management.PlatformLoggingMXBean;

public class PalindromeString {

    /*
            boolean palindromeString("test")  - Y
            boolean palindromeString('a')  - CTE
            boolean palindromeString(123)  - CTE
            boolean palindromeString(false) - CTE
            boolean palindromeString(123.234) - CTE
            boolean palindromeString("$%^&") - Y
            boolean palindromeString("abcba") - Y
            boolean palindromeString("") - Y
            boolean palindromeString(null) - N
            boolean palindromeString("Aa") - N
     */

    boolean palindromeString(String origString) {
        if (origString != null) {
            String revString = "";

            origString = origString.toUpperCase();
            for (int i = origString.length() - 1; i >= 0; i--) {
                revString = revString + origString.charAt(i); // a, b, c, b, a
            }
            if (origString.equals(revString)) return true;
        } else {
            System.out.println("String is null");
        }
        return false;
    }

    void palindromeStringUsingCharArray(String origString) {
        char[] charArray = origString.toCharArray();

        String revString = "";

        for (int i = charArray.length - 1; i >= 0; i--) { //O(n)
            revString = revString + charArray[i];
        }
    }

    public static void main(String[] args) {
        String str = "Aa";
        PalindromeString string = new PalindromeString();
        System.out.println(string.palindromeString(str));
    }
}
