/**
 * Created by admin on 11.12.2016.
 */
public class C6EX62Devisable {
    public static void main(String[] args) {
        double n = 1;
        double m = 2;
        System.out.println(isDivisable(2,3));
    }
    public static boolean isDivisable (int m, int n) {
        if  (n / m == 0) {
            return  true;
        } else {
            return false;
        }
    }
}
