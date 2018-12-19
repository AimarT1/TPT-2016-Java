/**
 * Created by admin on 4.12.2016.
 */
public class EX52 {
    public static void zoop(String Fred, int Bob) {
        System.out.println(Fred);
        if (Bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("Just for", bizz);
        clink(2 * buzz);
    }
    public static void clink(int fork) {
        System.out.print("Its ");
        zoop("Breakfast" , fork);
    }
    public static void ping(String strungStrung) {
        System.out.println("any, " + strungStrung + "more,");

    }
    }


