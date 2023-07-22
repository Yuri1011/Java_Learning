package Section_1;

import java.util.Arrays;

public class SwapMinElementWithMaxElement {
    public static void main(String[] args) {
        int[] array = {3, 1, -6, 7, 8, 9};

        var indexOfMinElement = 0;
        var valueMinElement = array[0];
        var indexOfMaxElement = 0;
        var valueMaxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            var currentElement = array[i];

            if (currentElement < valueMinElement) {
                valueMinElement = currentElement;
                indexOfMinElement = i;
            }

            if (currentElement > valueMaxElement) {
                valueMaxElement = currentElement;
                indexOfMaxElement = i;
            }
        }
        var temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        System.out.println("ARRAY==>>  " + Arrays.toString(array));
    }
}
