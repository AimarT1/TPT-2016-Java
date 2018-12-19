/**
 * Created by admin on 4.12.2016.
 */
public class C58H {
    public static void main(String[] args) {
        countdown(3);
        int n =0;

    }

    public static void countdown(int n) {
        if(n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
            

        }

        }
    }


