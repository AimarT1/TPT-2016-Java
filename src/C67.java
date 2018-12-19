/**
 * Created by admin on 11.12.2016.
 */
public class C67 {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
    public static int factorial (int n) {
        if (n == 0 ) {
            return  1;
        }
        int recruce = factorial(n-1);
        int result = n * recruce;
        return result;

    }

//6.9 One more example
    public static int fibonacci (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }}