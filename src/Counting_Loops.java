import com.sun.security.jgss.GSSUtil;

public class Counting_Loops {
    public static void main(String[] args) {
        for (int x = 1; x <=30; x++)
            System.out.print(x + "  ");
        System.out.println();
        for (int x = 30; x >=1; x--)
            System.out.print(x + "  ");
        System.out.println();
        for (int x = 0; x <=18; x += 3)
            System.out.print(x + "  ");
        System.out.println();
        for (int x = 10; x >=0; x -= 2)
            System.out.print(x + "  ");
        System.out.println();

    }
}