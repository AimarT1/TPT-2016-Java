/**
 * Created by admin on 15.11.2016.
 */
import java.util.Scanner;

public class C3Scanner {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line =in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type somthing else: ");
        line =in.nextLine();
        System.out.println("You also said: " + line);
        //3.3




    }
}
