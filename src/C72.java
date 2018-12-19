/**
 * Created by admin on 13.12.2016.
 */
public class C72 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + " " + Math.log(x));
            i = i +1;

            int i2 = 1;
            while (i2 < 10) {
                double x2 = (double) i2;
                System.out.println(x2 + " " + Math.log(x2) / Math.log(2));
                i2 =i2 +1;
                //7.2

                final double LOG2 = Math.log(2);
                int i3 = 1;
                while (i3 < 100){
                    double x3 = (double) i3;
                    System.out.println(x3 + " " + Math.log(x3)/ LOG2);
                    i3 = i3 *2;

                    //7.3 Encapsulation and generalization
                    int j = 1;
                    while (j <= 6) {
                        System.out.printf(" %4d", 2 * j);
                        j = j+1;
                    }
                System.out.println();
                }
            }
        }

            }
        }



