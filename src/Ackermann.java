/**
 * Created by admin on 11.12.2016.
 */
public class Ackermann {
    public static int calcAckermann(int n, int m) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcAckermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
        }
        return calcAckermann(m - 1, calcAckermann(m, n - 1));
    }


    public static void main(String[] args) {
        Ackermann ackermann = new Ackermann();
        ackermann.calcAckermann(-1, 1);
    }

}
