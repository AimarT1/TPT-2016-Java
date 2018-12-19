/**
 * Created by admin on 17.11.2016.
 */
public class C4Flow {
    public static void newLine() {
        System.out.println();

    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();

    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");

    }
}
