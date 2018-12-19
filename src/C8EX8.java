/**
 * Created by admin on 29.12.2016.
 */
public class C8EX8 {
    public static int  maxInRange ( int [] a ,int lowIndex, int highIndex) {
        int count = 100;
        for (int i = 0; i < a.length; i++)
        if ( a [i] >= lowIndex && a[i] < highIndex) {
            count++;
        }
        return count;

    }
    public static void maxValue (int lowIndex, int highIndex){
        if (lowIndex == highIndex) {
            System.out.println();
        } else {
            System.out.println();

        }
    }
}
