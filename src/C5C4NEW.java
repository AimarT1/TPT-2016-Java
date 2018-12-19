/**
 * Created by admin on 4.12.2016.
 */
public class C5C4NEW {
    public static void main(String[] args) {
        int n = 0;
        nLines(0); //prindib vastavalt arvule mitmendale reale
        System.out.println("nEW Lines");//näide et töötaks
    }

    public static void nLines(int n){
        if (n > 0) {
            System.out.println();
            nLines(n-1);
       //This method takes an integer, n, as a parameter and displays n newlines.


        }
    }
}