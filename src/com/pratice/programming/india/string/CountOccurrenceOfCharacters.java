package com.pratice.programming.india.string;

// Count the occurrence of a given character in a String?

/**
 * Questions:
 * Shall we consider 'A' and 'a' separately?
 * What is expected in case of Empty and Null String?
 */

import java.util.HashMap;

/**
 * Test Cases:
 * countCharacter("google", 'o') - Positive
 * countCharacter("google", 'a') - Negative
 * countCharacter("",' ') - Empty
 * countCharacter(null, ' ') - Null
 * countCharacter("googLe', 'l') - Case Sensitive
 */

public class CountOccurrenceOfCharacters {

    int countOccurrenceOfGivenCharacter(String str, char ch) {
        int charCount = 0;
        if (str == null || str.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) charCount++;
            }
        }
        return charCount;
    }

    HashMap countOccurrenceOfAllCharacters(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if (str == null || str.isEmpty()) {
            return hashMap;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
                } else {
                    hashMap.put(str.charAt(i), 1);
                }
            }
        }
        return hashMap;
    }

    public static void main(String[] args) {
        CountOccurrenceOfCharacters obj = new CountOccurrenceOfCharacters();
        System.out.println(obj.countOccurrenceOfAllCharacters("google"));
        System.out.println(obj.countOccurrenceOfGivenCharacter("google",'o'));
    }
}
