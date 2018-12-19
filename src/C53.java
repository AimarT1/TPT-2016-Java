/**
 * Created by admin on 17.11.2016.
 */
public class C53 {
    public static void main (String[] args) {
        int x = 1;
        //X- il väärtus puudus andsin ise väärtuse.(väärtus oli ette andmata)

        if (x % 2 == 0) {
            System.out.println("x is even ");
        } else {
             System.out.println("x is odd ");


         if (x > 0)
             System.out.println("x is positive");
            System.out.println("x is not zero");

            //1versioon ilma sulgudeta, SOOVITUSLIK TEHA SULGUDEGA
            //ET VÄLTIDA VIGU

            if (x > 0) {
                System.out.println("x is positive");
            }
            System.out.println("x is not zero");
            //Sama asi ainult sulgudega.
            //Ei valdanud mõju selles ülis.
        }


    }
}
