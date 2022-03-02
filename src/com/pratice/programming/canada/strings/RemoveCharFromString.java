package com.pratice.programming.canada.strings;

/* Write a method which will remove any given character from a String?

Q1-  If String is  "java". Should we remove all the a's? Ans - only first occurence
Q2 - Should I consider case sensitivity? - Yes
Q3 - What to do if string is empty or null? - Print on console
Q4 - What arguments should be passed to method and what is expected return type? for example boolean?
 */

/*
Test cases -
1. removeChar("Test String", 'T') // valid  - passed
2. removeChar("",'a') // - passed
3. removeChar("Test String", '') - CTE
4. removeChar("",'') -  CTE
5. removeChar("Test String",' ') passed
6. removeChar("123",'a') - passed
7. removeChar("Test String", 't') - passed
8. removeChar(123, 't') - CTE
9. removeChar(123.0, 't') - CTE
10.  removeChar(false, 'f') - CTE
11. removeChar("a",'a') - CTE
12. removeChar(" ",'a')
 */


public class RemoveCharFromString {

    public static void main(String[] args) {

        String str = "t";
        RemoveCharFromString strClassRef = new RemoveCharFromString();
        System.out.println(strClassRef.removeChar(str, 't'));


    }

    String removeChar(String str, char ch) {    // java a

        String finalString = "";
        boolean isFirstOccurence = false;
        if (str == null){
            System.out.println("String is null");
        }else if (str == "") {
            System.out.println("String is empty");
        }else{
            char[] chArray = str.toCharArray();
            for (int index = 0; index < str.length(); index++) {
                if ((chArray[index] == ch) && !isFirstOccurence) {
                   // System.out.println("insiide if");
                    isFirstOccurence = true;                  // if this is te first occurecne, make the flag true.
                } else {
                    finalString += chArray[index]; // jva
                }
            } if(!isFirstOccurence){
                System.out.println("Character does not exist.");
            }
            if ((finalString == "") && isFirstOccurence) { // if there was only one char in the string and that is to be removed
                System.out.println("There was only one char in the string and that is removed.");
            }
        }
        return finalString;
    }


}


