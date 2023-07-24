package Section_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
        var a = 1;
        var b = ++a;
        var c = a++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */

        String str = "Hello World!";
        char[] arrChars = str.toCharArray();
//        for (int i =  arrChars.length - 1; i < arrChars.length; i--) {
//            if (i >= 0) {
//                System.out.print(arrChars[i]);
//            }else {
//                break;
//            }
//        }
        StringBuilder builder = new StringBuilder();

        for (int i = arrChars.length - 1; i >= 0; i--) {
            builder.append(arrChars[i]);
        }

        String newStr = builder.toString();
        System.out.println("===>>>   " + newStr);

    }
}
