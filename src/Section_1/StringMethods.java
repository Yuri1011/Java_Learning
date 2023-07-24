package Section_1;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println(str.length());// show string length
        System.out.println(str.charAt(0));//get character from array by index
        System.out.println(Arrays.toString(str.toCharArray()));// make chars array from string
    }
}
