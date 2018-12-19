/**
 * Created by admin on 11.12.2016.
 */
public class C6EX9 {
    public static double power (double x, int n) {
       // minu versioon if (x^(n) = x * x^(n-1));
        if (n < 0 ) {
            return 1/(power(x,-n));
        } else if (n == 0) {
            return 1;
        }
        return x * power(x, n-1);


    }

    public static void main(String[] args) {
        System.out.println(power(-2,-2));
    }
}