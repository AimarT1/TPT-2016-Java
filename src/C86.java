import java.util.Arrays;
import java.util.Random;

/**
 * Created by admin on 26.12.2016.
 */
public class C86 {
    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static double sum(double[] a) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
    public static int [] randomArray (int size) {
        Random random = new Random();
        int [] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    // C8.3st Displaying arrays.
    public static void printArray (int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
        }
        //

    public static void main(String[] args) {
        int numValues = 1;
        int[] array = randomArray(numValues);
        printArray(array);
        printArray(randomArray(99));


        //8.8
        //väärtused annan mainis hetkel.
        int [] scores = randomArray(26);
        int a = inRange(scores,90,100);
        int b = inRange(scores,80,90);
        int c = inRange(scores,70,80);
        int d = inRange(scores,60,70);
        int f = inRange(scores,0,60);
        //pirint käsu.
        System.out.println(inRange(scores,1,99));

/**
        //C8.9
        int[] counts = new int[100];
        for (int i = 0 ; i < counts.length; i++){
            counts[i] = inRange(scores, i, i+1);
            System.out.println(counts);
 */ // v2 C8.9ST Thiscode traverses the array of scores only once to generate the histogram:
        int [] counts = new int[100];
        for (int i = 0; i < scores.length; i++ ){
            int index = scores[i];
            counts[index]++;
            //andsin print käsu
            printArray(counts);
        }

        /*
        //8.10 NÄITAB PUUDUVAID ARGUMENTE, PANIN SULGUDESSE ET PROGE TÖÖTAKS.

        for (int i = 0, i < values.lenght; i++ ){
            System.out.println(values[i]);
            //v2
            for (int  value : values ) {
                System.out.println(value);
                int [] counts2 = new int[100];
                for (int score : scores) {
                    counts2[score]++
                            */
                }
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high){
                count++;
                }
            }
        return count;
    }
 }
