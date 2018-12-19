/**
 * Created by admin on 5.12.2016.
 */
public class EX55 {
    public static void main(String[] args) {
        int Bottlecount = 7;
        singASong(Bottlecount);
    }
    public static void singASong(int count) {
        String printText;
        printText = count + " bottles of beer on the wall, + \n";
        printText += count + " bottles of beer,\n";
        printText += "ya' take one down, ya' pass it around,\n";
        printText += count - 1 + " bottles of beer on the wall.\n\n";
        System.out.printf(printText);

        if (count -1 <=0 ) {
            printText = "No bottles of beer on the wall, \n";
            printText += "no bottles of beer,\n";
            printText += "ya' can't take one down, ya' can't pass it around,\n";
            printText += "'cause there are no more bottles of beer on the wall!\n";
            System.out.printf(printText);
            return;
        }
        singASong(count -1);




    }
}
