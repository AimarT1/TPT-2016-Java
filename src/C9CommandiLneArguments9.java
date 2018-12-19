import java.util.Arrays;

/**
 * Created by admin on 5.01.2017.
 */
public class C9CommandiLneArguments9 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for (String arg : args){
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println(Arrays.toString(args ));
        System.out.println("The max is: " + max);
    }
}
