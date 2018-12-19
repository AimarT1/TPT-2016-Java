/**
 * Created by admin on 16.11.2016.
 */
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.abs;

public class GuessMyNumber {
    public static void main(String[] args) {
//pic a random number
        int userNumber;
        Scanner input = new Scanner(System.in);
       System.out.println("I'm thinking of a number between 1 and 100\n" +
               "(including both).");
        System.out.println("Can you guess what it is?");
        System.out.printf("Type a number: ");
        userNumber = input.nextInt();

        System.out.println("Your guess is: " + userNumber );
        System.out.println("The number i was thinking of is: ");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        System.out.println("You were off by: " + Math.abs(number - userNumber));
         //Tee lõpuni !







    }
}
