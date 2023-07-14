package Section_1;

import java.util.Arrays;
import java.util.Scanner;

public class WeekDayWithNewSwitch {
    public static void main(String[] args) {
        System.out.print("Enter number of week day: ");
        int dayOfWeek =  new Scanner(System.in).nextInt();

        switch (dayOfWeek){
            case 1 -> System.out.print("Monday today");
            case 2 -> System.out.print("Tuesday today");
            case 3 -> System.out.print("Wednesday today");
            case 4 -> System.out.print("Thursday today");
            case 5 -> System.out.print("Friday today");
            case 6 -> System.out.print("Saturday today");
            case 7 -> System.out.print("Sunday today");
        }
    }
}
