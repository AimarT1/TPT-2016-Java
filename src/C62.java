/**
 * Created by admin on 10.12.2016.
 */
public class C62 {
    public static void main(String[] args) {
        double dist = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println(dist);
    }

    public static double distance
            (double x1, double y1, double x2, double y2) {
        //uus rida koodi.
        double dx = x2-x1;
        double dy = y2-y1;
        //uus rida2
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared);
        //
        //uus rida3
        double result = Math.sqrt(dsquared);
        //
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        //
        return result;

    }
}
