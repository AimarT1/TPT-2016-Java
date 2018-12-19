import java.util.Scanner;
/**
 * Created by admin on 18.12.2016.
 */
public class C76BC { public static void scanDouble() {
    Scanner in = new Scanner(System.in);
    boolean okey;
    do {
        System.out.print(" Enter a number: ");
        if (in.hasNextDouble()) {
            okey = true;
        } else {
            okey = false;
            String word = in.next();
            System.err.print(word + " is not a number");
        }
    } while (! okey);
    double x =in.nextDouble();

}
    public static void main(String[] args) {
        scanDouble();
        newline();
        scanDouble2();
        newline();
        scanDouble3();
    }
    //break statement

    public static void scanDouble2 () {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print(" Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " is not a fucin number");
        }
        double x = in.nextDouble();
    }
    // tahtsin rida vahele lihtsalt
    public static void newline () {
        System.out.println();
    }
    //continue statement
    public static void scanDouble3 () {
        Scanner in = new Scanner(System.in);
        int x3 = -1;
        int sum = 0;
        while (x3 != 0) {
            x3 =in.nextInt();
            if (x3 <= 0) {
                continue;
            }
            System.out.println(" Adding " + x3);
            sum += x3;
        }
    }
}


