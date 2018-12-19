/**
 * Created by admin on 10.12.2016.
 */
public class C6111{
    public static void main(String[] args) {
        double x = 1.5;
        //andsin väärtuse
        System.out.println(absoluteValue(x-2));
        //kutsusin välja
    }
    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}
