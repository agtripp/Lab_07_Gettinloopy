import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int c = 0;
        int f = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temp in C: ");
            if (in.hasNextInt()) {
                c = in.nextInt();
                f = (c * 9/5) + 32;
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " and is not a valid temp.");
            }
        }while(!done);
        System.out.println(c + " degrees C is " + f + " degrees F");
    }
}