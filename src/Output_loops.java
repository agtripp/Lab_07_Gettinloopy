public class Output_loops {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 5; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 5; x >= 1; x--) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}