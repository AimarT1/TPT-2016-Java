/**
 * Created by admin on 4.12.2016.
 */
public class C58HUP {
        public static void main(String[] args) {
            countup(5);
            int n = 0;
        }

        public static void countup(int n) {
            if (n == 0) {
                System.out.println("Blastoff! ");
            } else {
                countup(n - 1);
                System.out.println(n);


            }
        }
    }

