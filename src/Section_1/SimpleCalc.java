package Section_1;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
//        read source data
        System.out.print("Введите первое значение: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Введите второе значение: ");
        int b = new Scanner(System.in).nextInt();
//        processing
        var addition = a + b;
        var subtraction = a - b;
        var multiplication = a * b;
        var division = a / b;
        var remainderOfDivision = a % b;
//        display results
        System.out.println("Сумма: " + addition);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + division);
        System.out.println("Отстаток от деления: " + remainderOfDivision);
    }
}
