/**
 * Created by admin on 11.12.2016.
 */
public class C6EX7 {
    public static int oddSum (int n) {
        if (n < 1) {
            return n;
        } else {
            return oddSum(n-2) + n;
        }
    }
//kutsusin välja
    public static void main(String[] args) {
        System.out.println(oddSum(6));
    }
}
