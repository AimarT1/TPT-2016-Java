/**
 * Created by admin on 10.12.2016.
 */
public class C6 {
    public static void main(String[] args) {
        int n = 2;
        countup(3);
        System.out.println("Have a nice day !");
    }

    public static void countup(int n) {
        if (n==0) {
            System.out.println("Blastoff!");
        } else {
            countup(n-1);
            System.out.println(n);

            }
        }
    }



