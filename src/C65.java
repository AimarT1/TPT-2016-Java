/**
 * Created by admin on 11.12.2016.
 */
public class C65 {
    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);
    }
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
            //so thereis nothing wrong with returning it directly (without the if statement):
            // return  x > -10 && x < 10;
        }
    }
}
