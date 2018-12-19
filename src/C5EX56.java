/**
 * Created by admin on 10.12.2016.
 */
public class C5EX56 {
    public static void baffle(String Blimp) {
        System.out.println(Blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + "zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-waa-haa");
        }
    }

    public static void main(String[] args) {
        zippo("rattle",13);
    }

    }
