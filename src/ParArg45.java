/**
 * Created by admin on 17.11.2016.
 */
public class ParArg45 {
    public static void printTwice (String s) {
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        printTwice("Dont make me say this twice!");
//näide lõppes siin,alumine lissa näide ühes koodis.
        String argument = "Never say never!";
        printTwice(argument);


    }
}
