/**
 * Created by admin on 7.01.2017.
 */
public class C9EX2 {
    public static void letterHist (String string) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char [] bet = alphabet.toCharArray();
        int count  = 0;
        for (char c : bet) {
            count = charCounterWithLoop(string.toLowerCase(),c);
            System.out.println(c + "   " + (count));
        }
    }
    public static int charCounterWithLoop (String string , char c) {
        int count = 0;
        for (int i = 0 ; i < string.length();i++ ){
            char cb4 =string.charAt(i);
            if (cb4 == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        letterHist("Truuuuuuuuuuu");
    }
}
