import java.util.Scanner;

/**
 * Created by admin on 17.11.2016.
 */
public class C57 {
    public static void main(String[] args) {
        printLogaritm(2);
        scanDouble();

    }

    public static void printLogaritm (double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is;" + result);
        //5.6 return statement
    }

    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        printLogaritm(x);

    }

    }

