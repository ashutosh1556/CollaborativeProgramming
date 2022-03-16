package com.pratice.programming.canada.strings;

public class ReverseString {

    public static void main(String[] args) {

        String srcString = "hello world";
        ReverseString revStr = new ReverseString();
        System.out.println(revStr.reverse(srcString));

    }

    String reverse(String str) {
        String result = "";
        if((str == null) || (str.isEmpty())){
            System.out.println("string is empty");
        }else{
            char[] charArr = str.toCharArray();
            for(int i=str.length() -1; i >= 0; i--){
                result += charArr[i];
            }
        }
        return result;
    }

    /*

    input = hello world
    output = world hello
     */
    public void reverseWords(String str){

        String result = "";
        if((str == null) || str.isEmpty()){

            System.out.println("String is empty");
        }else{

            }

        }


}
