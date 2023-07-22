package Section_1;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int startIndex = 1;
        int endIndex = 3;
        int[] destination = new int[endIndex - startIndex];

        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];
        }
//        System.arraycopy(source, 0 + startIndex, destination, 0, destination.length);

//        System.arraycopy(source,0,destination,0,source.length);


        System.out.println(Arrays.toString(destination));
    }
}
