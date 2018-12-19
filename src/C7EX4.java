/**
 * Created by admin on 23.12.2016.
 */
public class C7EX4 {
    public static int factorial(int n) {
        int factorial = n;
        if (n < 0) {
            return 1;
        } else if (n == 0) {
            return 1;
        }
    for(int i = n- 1; i > 0; i--){
        factorial *= i;
    }
    return factorial;
}

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
