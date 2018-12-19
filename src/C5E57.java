import java.util.Random;
import java.util.Scanner;


/**
 * Created by admin on 10.12.2016.
 */
public class C5E57 {
    public static void main(String[] args) {
        int userNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Im thinging of a number between 1 and 100\n " + "(include both).");
        System.out.println("Can you quess what it is ?");
        System.out.printf("Type a number");
        userNumber = input.nextInt();

        System.out.println("Your quess is" + userNumber);
        System.out.println("The number i was thinking of is: ");

        Random random = new Random();
        int number =  random.nextInt(100) + 1;

        System.out.println(number);
        System.out.println("You where of by: " + Math.abs(number - userNumber));
        //Tee lõpuni!


    }
}
