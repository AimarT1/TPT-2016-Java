/**
 * Created by admin on 11.12.2016.
 */
public class Multadd {
    public static void main(String[] args) {
        Multadd ma = new Multadd();

        double a = Math.sin(Math.PI / 4 );
        double b = 1.0;
        double c = Math.cos((Math.PI / 4) / 2 );
        System.out.println(ma.Multadd(a,b,c));
        System.out.println(expSum(10));

        System.out.println(Multadd(1.0, 2.0, 3.0));

    }

    public static double Multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum (double x) {
    double d = x;
        double d1 = Math.exp(-x);
        double d2 = Math.sqrt(1-d1);
        return Multadd(d,d1,d2);

    }
}





