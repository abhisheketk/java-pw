import java.util.*;

// chalo acha hai bohot
public class lec1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println("a is grater");
            } else {
                System.out.println("a is smaller");
            }

        }

    }
}