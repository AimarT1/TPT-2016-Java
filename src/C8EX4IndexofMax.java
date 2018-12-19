/**
 * Created by admin on 27.12.2016.
 */
public class C8EX4IndexofMax {
    public static int  IndexofMax (int [] m, int  n )  {
        for (int i = 0; i < m.length; i++) {
            if (m [i] > n  ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] m = new int[1];
        System.out.println(IndexofMax(m,17));
        System.out.println(IndexofMax(m,7));
    }
}
