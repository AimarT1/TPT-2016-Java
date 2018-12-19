/**
 * Created by admin on 23.12.2016.
 */
public class myexp {
    //ex = 1 + x + x2=2! + x3=3! + x4=4! + : : ://
    public static double myExp (int x, int n) {
        double exp = 1 + x;
        for (int i = 2; i <= n; i++){
            exp *= x;
        }
        return exp;
    }
    public static double myExp2 (int x, int n) {
        double exp = 1 + x;
        for (int i = 2; i <= n; i++) {
            exp += (x * x) / (i / i);
        }
        return exp;
    }

    public static void main(String[] args) {
        System.out.println(myExp3(2,6));
    }
    public static double myExp3 (int x, int n){
        double result = 0;
        for (int i = 0; i <= n; i++ ){
            result += (power(x,i)/factorial(i));
        }
        return result;
    }
    public static double power (double x, int n) {
        // minu versioon if (x^(n) = x * x^(n-1));
        if (n < 0 ) {
            return 1/(power(x,-n));
        } else if (n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }
    public static int factorial (int n) {
        if (n == 0 ) {
            return  1;
        }
        int recruce = factorial(n-1);
        int result = n * recruce;
        return result;

    }
}
