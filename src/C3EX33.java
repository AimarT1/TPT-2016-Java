/**
 * Created by admin on 16.11.2016.
 */

import java.util.Scanner;

public class C3EX33 {
    public static void main(String[] args) {
        int seconds , minutes, hours;
        Scanner input = new Scanner(System.in);

        System.out.println("Input seconds ");
        seconds = input.nextInt();

        System.out.printf("Enter seconds", seconds );
        System.out.printf("\nConverted: \n");

        hours = seconds / 3600;
        minutes = (seconds % 3600) /60;
        seconds = seconds % 60;

        System.out.printf("%d hours, %d minutes, %seconds", hours ,minutes, seconds);


    }
}
