/**
 * Created by admin on 15.11.2016.
 */
public class Time {
    public static void main(String[] args) {
        String firstline = "Hello again!";
        System.out.println(firstline); //näide töötav

        int hour = 11;
        int minute = 03;
        int sec = 45;
        int maxsec = 24 * 60 * 60;
        int passedsec = hour * minute * 60 + sec;
        //võib kokku ka kirjutada

        System.out.println("Seconds since midnight: ");
        System.out.println(passedsec + "\n");
        System.out.println("Seconds remaining in the day: ");
        System.out.println(maxsec - passedsec + "\n");
        System.out.println("Precantage of the day that has passed: ");
        System.out.println(100- (passedsec * 100.0 / maxsec)+ "\n");

        int hour2 = 10;
        int minute2 =11;
        int sec2 = 22;
        int elapsedtime = ((hour - hour2) + (minute - minute2) + (sec - sec2));



        System.out.println("Time elapsed since start: ");
        System.out.println(elapsedtime + "\n");








    }
}
