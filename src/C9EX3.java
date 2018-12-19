/**
 * Created by admin on 7.01.2017.
 */
public class C9EX3 {
    public static int String (String string) {
        String s = "((3 + 7) * 2)";
        int count = 0;

        for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')'){
                count --;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = String("()");
        System.out.println(count);
    }
}
