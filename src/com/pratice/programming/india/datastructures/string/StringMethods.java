package com.pratice.programming.india.datastructures.string;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java";
        String newString = str.replace('a','b');
        char charAtIndex = str.charAt(0);
        char[] charArray = str.toCharArray();
        int indexOfLetter = str.indexOf('j');
        String subString = str.substring(2,4);
    }
}
