package Rough;

public class StrToIntAndViceVersa {

    public static void main(String[] args) {
        String str = "101";
        int num1 = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);

        System.out.println(num1 + 1);
        System.out.println(num2 + 1);
    }
}