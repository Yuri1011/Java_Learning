package Section_1;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = " Hello,World,! ";

        System.out.println(str.length());// show string length
        System.out.println(str.charAt(0));//get character from array by index
        System.out.println(Arrays.toString(str.toCharArray()));// make chars array from string

        System.out.println(str.contains("World"));// check contain word in string
        System.out.println(str.isEmpty());// check string for empty
        System.out.println(str.indexOf('l'));// show the first match character in string
        System.out.println(str.lastIndexOf('l'));// show the last match character in string

        System.out.println(str.repeat(3));// repeats a string a given number of times
        System.out.println(str.replace('H','J'));//change characters in string
        System.out.println(str.replace("Hello","Bye"));//change worlds in string
        System.out.println(str.substring(5));//get substring by index
        System.out.println(Arrays.toString(str.split(",")));// make array from string by any symbol
//        System.out.println(str.trim());
        System.out.println(str.strip());// remove gaps around string same as trim()
    }
}
