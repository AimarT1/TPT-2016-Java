/**
 * Created by admin on 13.12.2016.
 */
public class C7 {
    public static void countdown (int n) {
        while (n > 0) {
            System.out.println(n);
            n = n-1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Blastoff");
        //Ei prindi ütleb cant void ...
        //System.out.println(sequence(3));

    }

    public static void sequence (int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
               n = n / 2;
            } else {
                n = n *3 +1;

        }
    }
    }
}

