/**
 * Created by admin on 13.12.2016.
 */
public class C73 {
    public static void printRow() {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow2(int n) {
        int i2 = 1;
        while (i2 <= 6) {
            System.out.printf("%4d", n * i2);
            i2 = i2 + 1;
        }
        System.out.println();
    }

    public static void printTable() {
        int i2 = 1;
        while (i2 <= 6) {
            printRow2(i2);
            i2 = i2 + 1;
        }
    }


    public static void main(String[] args) {
        printRow();
        printRow2(3);
        printTable();

    }
}