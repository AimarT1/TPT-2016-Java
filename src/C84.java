import java.util.Arrays;

/**
 * Created by admin on 26.12.2016.
 */
public class C84 {
    public static void main(String[] args) {
        double [] a = new double[3];
        double [] b = a;
        // pidin nimetama teise b2 sest b on juba välja kutsutud, aga esimene osa jääks samaks lihtsat.
        //If you actually want to copy the array, not just a reference,
        // you have to createa new array and copy the elements from the old to the new, like this:
        double [] b2 = new double[2];
        for (int i = 0; i < 3; i++) {
            b[i] = a[i];
            // meetod 3
            double [] b3 = Arrays.copyOf(a,3);
            //C8.5 Array length
            double [] b4 = new double[a.length];
            for (int i4 = 0; i4 < a.length; i4++) {
                b[i] = a[i];
            }
            //You can also use a.length with Arrays.copyOf:
            double[] b5 = Arrays.copyOf(a,a.length);

        }
        System.out.println(b);
        System.out.println(b2);
        System.out.println(a);
        System.out.println(Arrays.copyOf(a,3));
        System.out.println(a.length);
        System.out.println(Arrays.copyOf(a,a.length));
    }
}
