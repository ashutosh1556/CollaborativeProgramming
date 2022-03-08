package com.pratice.programming.canada.strings;

import java.util.Arrays;

public class IsAnagram {


    public static void main(String[] args) {
        String str1 = "ruchi";
        String str2 = "Ruchi";
        IsAnagram anagram = new IsAnagram();
        System.out.println(anagram.isAnagram(str1, str2));
    }

    boolean isAnagram(String str1, String str2) {
        boolean isAnagram = true;

        if (str1 == null || str2 == null) return false;
        else if (str1.length() != str2.length()) return false;
        else if (str1.isEmpty() || str2.isEmpty()) return false;
        else {

            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);
            System.out.println(str1Arr);
            System.out.println(str2Arr);
            for(int i=0; i<str1.length();i++){
                if(str1Arr[i] != str2Arr[i])
                {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }
}



