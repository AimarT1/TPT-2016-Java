/**
 * Created by admin on 23.12.2016.
 */
public class C7EX3 {
    public static double power (double x, int n) {
double power = x;
        if (n < 0) {
            return 1;
        } else if (n == 0) {
            return 1;
        }
        for (int i = 1; i < n; i ++){
        power *= x;
    }
    return power;

    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
