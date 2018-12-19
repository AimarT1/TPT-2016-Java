/**
 * Created by admin on 17.11.2016.
 */
public class C55 {
    public static void main(String[] args) {
        int x = 9;
        int n = 7;

        boolean flag;
        flag=true;
        boolean testResult = false;
       boolean evenFlag = (n % 2 == 0); //true if n is even
        boolean positiveFlag = (x>0); //true is x is positive

        System.out.println(evenFlag);
        System.out.println(positiveFlag);

        if (evenFlag) {
            System.out.println("n was even when i checked it");
        } if (!evenFlag) {
            System.out.println("n was odd when i checed it");
        }
    }
}
