/**
 * Created by admin on 7.01.2017.
 */
public class C9EX4 {
    /**
     * returns the first character of the given String.
     */
    public static char first(String s) {
        return  s.charAt(0);
    }
    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }
    /**
     * Returns all but the first and the last letter of String.
     */
    public static String middle(String s){
        return s.substring(1,s.length()-1);
    }
    /**
     * Returns the lenght of the given String.
     */
    public static int lenght(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(first("Shitt"));
        System.out.println(rest("NO"));
        System.out.println(middle("Finger"));
        System.out.println(lenght("Why"));
        System.out.println();
        System.out.println();
        String backwards = reverseString("Coffe");
        System.out.println(backwards);

    }
    public static void printString(String string) {
        System.out.println(first(string));
        if (lenght(string) > 1){
            printString(rest(string));
        }

    }
    public static void printBackward(String string) {
        System.out.println(rest(string));
        if (lenght(string) != 1 ) {
            printBackward(rest(string));
            System.out.println(first(string));
        } else {
            System.out.println(string);
        }
    }
    public static String reverseString(String s){
        if (s.length() == 0)
         return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
