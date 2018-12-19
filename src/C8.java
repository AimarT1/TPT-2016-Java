import java.util.Arrays;

/**
 * Created by admin on 26.12.2016.
 */
public class C8 {
    public static void main(String[] args) {
        // näide et töötatab:
        int size = 1;
        // size vajab väärtust et välja kutsuda.

        int[] counts;
        double[] values;
        counts = new int[4];
        values = new double[size];
        // Saab ka nii ehk ühe reana:
        // int [] counts = new int [4];
        // double [] values = new double [size];
        //8.2 :

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;
        System.out.println("The zeroth element is :" + counts[0]);

        int i = 1;
        while (i < 4) {
            System.out.println(counts[i]);
            i++;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            System.out.println(counts[i2]);

        }
        // 8.3
        int [] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));
    }
    // If we want to display the elements of the array, we can do it ourselves:

    public static void printArray (int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
        // java.util.Arrays that providesmethods for working with arrays. One of them, toString, returns a string representation of an array.
        System.out.println(Arrays.toString(a));
    }
}