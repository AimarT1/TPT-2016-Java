/**
 * Created by admin on 4.12.2016.
 */
public class C58Bnumbers {
    public static void main(String[] args) {
        displayBinary(17);
        System.out.println();
    }

    public static void displayBinary(int value) {
        if (value > 0) {
        displayBinary(value / 2);
        System.out.println(value % 2);
    }
}}
