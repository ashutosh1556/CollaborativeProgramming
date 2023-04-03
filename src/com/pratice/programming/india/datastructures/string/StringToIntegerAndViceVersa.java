package com.pratice.programming.india.datastructures.string;

class StringToIntegerAndViceVersa {

    void stringToInteger(String str) {
        int num1 = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);

        System.out.println(num1 + 1);
        System.out.println(num2 + 1);
    }

    void integerToString(int num) {
        String str1 = "" + num;
        String str2 = String.valueOf(num);

        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        StringToIntegerAndViceVersa obj1 = new StringToIntegerAndViceVersa();
//        obj1.stringToInteger("321");
        obj1.integerToString(123);
    }
}
