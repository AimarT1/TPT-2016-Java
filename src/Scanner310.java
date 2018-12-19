/**
 * Created by admin on 15.11.2016.
 */
import java.util.Scanner;

public class Scanner310 {
    public static void main(String[] args) {
        String line;
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d.\n", name, age );

        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();//READ THE NEW LINE
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);




    }
}
