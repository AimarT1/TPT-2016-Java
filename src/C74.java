/**
 * Created by admin on 18.12.2016.
 */
public class C74 {
    public static void printTable(int rows) {
        int i =1;
        while (i <= rows) {
            printRow(i);
            i = i +1 ;
        }
    }
    public static void printRow(int n) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
//More generalization, suurem kasutusa ala.

    public static void printRow2(int n, int cols) {
        int i2 = 1;
        while (i2 <= cols) {
            System.out.printf("%4d", n * i2 );
            i2 = i2 + 1;
        }
        System.out.println();
    }

    public static void printTable2 (int rows2){
        int i2 = 1;
        while (i2 <= rows2) {
            printRow2(i2, rows2);
            i2 = i2 +1;
            //You could save ink by printing half of the table, and you would only have to
            //change one line of printTable:printRow(i, i);
            //printRow2(i2,i2); //The result isa triangular multiplication table.
        }
    }

    public static void main(String[] args) {
        printRow(4);
        printTable(7);
        printRow2(8,8);
        printTable2(8);

    }
}

