package com.pratice.programming.india.datastructures.string;

public class RemoveCharFromString {

    /**
     * Approach 1: Simply iterate through and print the string, skip the character to be removed.
     * Approach 2: Use replace() method and replace the character with ' ' i.e. space
     * Approach 3: Iterate through string and shift letters to the left side overriding matching character
     */

    /**
     * Test Cases:
     * removeCharFromString("google",'l') - Happy Path
     * removeCharFromString("googLe", 'l') - Case Sensitive
     * removeCharFromString("google", 'b') - Negative case
     * removeCharFromString("", ' ') - Empty & Space
     * removeCharFromString(null, ' ') - Null & Space
     * removeCharFromString("g", 'g') - Corner Case
     * removeCharFromString("google",'o') - Consecutive chars
     * removeCharFromString(123, 'g') - Compile Time Error
     * removeCharFromString(123.12, 'g') - Compile Time Error
     */

    String removeCharSkip(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    String removeCharReplace(String str, char ch) {
        return str.replace(ch, ' ');
    }

    String removeCharShiftLeft(String str, char ch) {
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {  // ashu, s
            if (ch == chArray[i]) {
                for (int j = i; j < chArray.length - 1; j++) {
                    chArray[j] = chArray[j + 1];
                    /**
                     * Itr 1: ahhu
                     * Itr 2: ahuu
                     * Itr 3: ahuu
                     */
                }
            }
        }
        return new String(chArray);
    }

    public static void main(String[] args) {
        RemoveCharFromString obj = new RemoveCharFromString();
        String string = obj.removeCharShiftLeft("ashu", 's');
        System.out.printf(string);
    }
}
