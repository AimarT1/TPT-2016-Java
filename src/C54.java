/**
 * Created by admin on 17.11.2016.
 */
public class C54 {
    public static void main(String[] args) {
        int x = 23;

        if (x>0) { System.out.println("x is positive");
        } else if (x<0) {System.out.println("x is negative");
        } else { System.out.println("x is zero");
        }
//Chaining meetod
        if (x== 0) {System.out.println("x is zero");
        } else {
            if (x>0){ System.out.println("x is positive");
            } else {System.out.println("x is negative");
            }
//Nesting meetod
//(ei näe vahet, aga Chaing tundub arusaadavam kui Nesting, mis võib minna segasemaks)
        }
    }
}
