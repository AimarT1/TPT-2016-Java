/**
 * Created by admin on 24.12.2016.
 */
public class C7EX6GAUSS {
    public static double Gauss(int x, int n) {
        double result = 0;
        for (int i= 0; i <= n; i++) {
            result += Math.pow(-1,i) * Math.pow(x,2*i) / factorial(i);
        }
        return result;
    }
    public static double Gauss2(int x, int n) {
        if (n == 0)
            return 1;

        double result = 1;
        double tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp = tmp * x*x / i;
            double sign;
            if (i % 2 == 0)
                sign = 1;
            else
                sign = -1;
            result += sign * tmp;
        }
        return result;
    }
    public static int factorial (int n) {
        if (n == 0 ) {
            return  1;
        }
        int recruce = factorial(n-1);
        int result = n * recruce;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Gauss2(3,100));
    }
}
