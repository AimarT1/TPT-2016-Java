/**
 * Created by admin on 17.11.2016.
 */
public class C4EX43 {
    public static void printAmerican (String day, int date,String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEurapean (String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year );
    }




    public static void main(String[] args) {
        printAmerican("Monday", + 11, "November",2016 );
        printEurapean("Monday", + 11, "November", 2016);


    }


    }

