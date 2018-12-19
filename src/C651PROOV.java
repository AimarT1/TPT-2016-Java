/**
 * Created by admin on 11.12.2016.
 */
public class C651PROOV {
    public static void main(String[] args) {
        double z = 1;
        System.out.println(isSingleDigit(2));

    }
    public static boolean isSingleDigit(int z) {
        if (isSingleDigit(z)) {
            System.out.println("z is small");
        } else {
            System.out.println("z is big");
            return isSingleDigit(2);
        }
        return true;
    }}

