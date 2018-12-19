import java.util.Scanner;

/**
 * Created by admin on 4.12.2016.
 */
public class C5RETURN57H {
    public static void main(String[] args) {
        printLogarithm(17);
        scanDouble();
    }

    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error:x must be positive. ");

            return;
        }
        double result = Math.log(x);
        System.out.println("The log x is " + result);
        //5.6 return statement
    }

         public static void scanDouble(){
             Scanner in = new Scanner(System.in);
             System.out.print("Enter a number:");
             if  (!in.hasNextDouble()) {
                 String word = in.next( );
                 System.err.println(word + "is not a number");
                 return;
             }
             double x = in.nextDouble();
             printLogarithm(x);
    }
    }

