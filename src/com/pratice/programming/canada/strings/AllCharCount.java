package com.pratice.programming.canada.strings;

import java.util.HashMap;

public class AllCharCount {

    public static void main(String[] args) {


        AllCharCount charCount = new AllCharCount();
       // charCount.countTheOccurence("rruucchi");
        System.out.println(charCount.countUsingHashmap("ruuccchi"));

    }

    void countTheOccurence(String str) {
        char[] ch = str.toCharArray(); // space compleity - O(n)
        int charCounter = 1;

        for (int i = 0; i < str.length(); i++)   //rruchi
        {
            charCounter = 1;
            if (ch[i] != '&') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (ch[i] == ch[j]) {
                        charCounter++;
                        ch[j] = '&';
                    }
                }
                System.out.println(ch[i] + " occurs" + " " + charCounter + " times.");
            }
        }
    }

    HashMap countUsingHashmap(String str) {

        char[] chArr = str.toCharArray(); //rruuuchi
        int charCount = 1;
        HashMap hm = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            charCount = 1;
            if (hm.containsKey(chArr[i])) {
                charCount = (int) hm.get(chArr[i]);
                hm.put(chArr[i],charCount+1 );
            } else {
                hm.put(chArr[i], charCount);
            }
        }
        return hm;
    }
}


