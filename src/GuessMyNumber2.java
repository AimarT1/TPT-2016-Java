import java.util.Random;
import java.util.Scanner;

/**
 * Created by admin on 7.01.2017.
 */
public class GuessMyNumber2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 0 and 99\n" +
                "(including both).");
        System.out.println("Can you guess what it is?");
        while (true){
            System.out.printf("Type a number: ");
           int userNumber = input.nextInt();
            if (number == userNumber) {
                System.out.println("You`re right !!! ");
                break;
            }else if (userNumber < number) {
                System.out.println("Too low");
            }else  if (userNumber > number){
                System.out.println("Too high");
            }
        }
    }
}
