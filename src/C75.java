/**
 * Created by admin on 18.12.2016.
 */
public class C75 {
    public static void printTable(int rows ) {
        for (int i = 1; i <= rows; i = i +1) {
            printRow (i, rows);
        }
    }

    public static void printRow (int n, int cols) {
        for (int i = 1; i <= cols; i = i + 1) {
            System.out.printf("%4d", n *1);
        }
        System.out.println();
    }
    // V2If you need to use a loop variable outside the loop, you have to declare it outside the loop.

    public static void printTable2 ( int rows){
        for (int i2 =1; i2 <= rows; i2 = i2 + 1) {
            printRow2(i2, rows);
        }
    }

    public static void printRow2 (int n2, int cols2) {
        int i2 ;
        for (i2 = 1; i2 <= cols2; i2 = i2 +1){
            System.out.printf("%4d", n2* i2);
        }
        System.out.println(i2);
    }

    public static void main(String[] args) {
        printRow(1,1);
        printTable(5);
        printRow2(2,5);
        printTable2(4);
    }
}
