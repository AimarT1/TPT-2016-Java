/**
 * Created by admin on 5.01.2017.
 */
public class C9 {
    public static void main(String[] args) {
        String fruit = "banana" ;
        char letter = fruit.charAt(0) ;
        if (letter == 'a') {
            System.out.println('?');
            System.out.print("Roman alphabet: ");
            for (char c = 'A' ; c <= 'Z'; c++ ) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.print("Greek alphabet: ");
        for (int i =913; i <= 937; i++ ){
            System.out.print((char)i);
            //Miks topelt sulud ??
        }
        System.out.println();
    }
    {
    //9.2
    String name = "Alan Turing";
    String upperName = name.toUpperCase();
    String text = " Computer Sience is fun ! ";
    text = text.replace("Computer Sience" ,"CS");
}
    {
        //9.3
        String fruit = "banana" ;
        for (int i = 0; i < fruit.length(); i ++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
            for (char letter2: fruit.toCharArray()) {
                System.out.println(letter2);
                int lenght = fruit.length();
                char last = fruit.charAt(lenght);
                System.out.println(lenght); // peaks lööma : StringIndexOutOfBoundsException.
                int lenght2 =fruit.length();
                char last2 = fruit.charAt(lenght2-1); // Correct varjant .
                // 9.4
                fruit.substring(0);
                fruit.substring(2);
                fruit.substring(6);
                fruit.substring(0,2);
                fruit.substring(2,5);
                fruit.substring(i,i + lenght); //  fruit.substring(i,i + len) = len = lenght.
                // 9.5
                String fruit3 = " banana ";
                int index = fruit3.indexOf('a');
                int index2 = fruit3.indexOf('a', 1);
                fruit.indexOf("nan");
            }
        }
    }
    //9.3
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i --) {
            r = r + s.charAt(i);
        }
        return r;

    }

    {
        //9.6
        String name1 = " Alan Turing";
        String name2 = " Ada Lovelace ";
        if (name1 == name2) {
            System.out.println(" The names are the same. ");
            //The right way to compare strings is with the equals method, like this:
            if (name1.equals(name2)) {
                System.out.println(" The names are the same. ");
                int diff = name1.compareTo(name2);
                if (diff == 0) {
                    System.out.println(" The names are the same. ");
                } else if (diff < 0) {
                    System.out.println(" name1 comes before name2. ");
                } else if (diff > 0) {
                    System.out.println(" name2 comes before name1.");

                }
            }
        }
    }
    //9.7
                    public static String timeString(int hour, int minute){
                    String ampm;
                    if (hour < 12) {
                        ampm = "AM";
                        if (hour == 0) {
                            hour = 12;
                        }
                    }else{
                            ampm = "PM;";
                        hour = hour -12;
                        }
                        return String.format("%02d:%02d %s", hour , minute , ampm);
                    }
    //9.8
    String str = "12344";
    int num = Integer.parseInt(str);

    int num2 = 12345;
    String str2 = Integer.toString(num2);

                }

