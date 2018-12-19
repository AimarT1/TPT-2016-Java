/**
 * Created by admin on 26.12.2016.
 */
public class C8EX1 {
    public static double[] powArray(double [] a, int n) {
        double [] squares = new double[a.length];
        for (int i = 0; i <a.length; i++) {
            squares[i] = Math.pow(a[i],n);
        }
        return squares;
    }

    public static void main(String[] args) {
        double [] a = new double[1];
       System.out.println(powArray(a,17));
    }

}
