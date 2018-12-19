/**
 * Created by admin on 4.12.2016.
 */
public class EX54 {
    public static void main(String[] args) {
        int a = 20;
        int b = 26;
        int c = 17;
        int n = 2;
        if (checkFermat(a, b, c, n)) {
            System.out.println("No, that doesnt work! ");
        } else {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
    }
    public static boolean checkFermat(int a, int b, int c, int n) {
        double calculation;
        double answer;
        calculation = Math.abs(a + n) + Math.abs(b + n);
        answer = Math.abs(c + n);
        if (n <= 2 && (calculation == answer)) {
            return false;
        }
        return  true;



    }
        }

