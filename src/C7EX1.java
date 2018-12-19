/**
 * Created by admin on 18.12.2016.
 */
public class C7EX1 {
    public static void main(String[] args) {
        loop(10);
        printTable(11,21);
    }
    public static void  loop (int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 ==0) {
                i = i / 2 ;
            } else {
                i = i +1;
            }
        }
    }
    public static void printTable (int n, int i) {

    }
}
