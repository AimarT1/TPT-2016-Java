/**
 * Created by admin on 11.12.2016.
 */
public class C6EX3Triangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(9,15,3));

    }
    public static boolean isTriangle (int n1, int n2, int n3) {
        if (n1 +n2 > n3 || n2 +n3 >n1 || n1 + n3 > n2) {
            return true;
        } else {
            return false;

        }
    }
}
