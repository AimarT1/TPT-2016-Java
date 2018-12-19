/**
 * Created by admin on 11.12.2016.
 */
public class C6EX5 {
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        if (flag1 && flag2) {
            System.out.println("PING!");
        }
        if (flag1 || flag2) {
            System.out.println("PONG!");
        }
    }

    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjous(int x) {
        boolean FrabjousFlag;
        if (x > 0) {
            FrabjousFlag = true;
        } else {
            FrabjousFlag = false;
        }
        return FrabjousFlag;
    }
}
