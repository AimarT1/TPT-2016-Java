/**
 * Created by admin on 23.12.2016.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sqrt {
    public static double squareRoot (double a) { //x1 = (x0 + a/x0)/2//
  double x1 = a / 2;
        double n = 0;

        while (!(x1 == n)) {
            n = x1;
            x1 = (x1 + a / x1) / 2;
        }
        return BigDecimal.valueOf(n).setScale(4,RoundingMode.HALF_EVEN).doubleValue();
        //BigD kasutasin et saaks kasutada roundingmodi ümarduse jaoks, set scaleis määrad mitu kohta tuleb peale koma,
        //println is määrad väärtuse.
        // oli üldiselt päris keeruline ja läks aega et nuputada õiget lahendust.
    }
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.squareRoot(81));
    }

}
