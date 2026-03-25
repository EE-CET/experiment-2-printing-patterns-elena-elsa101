import java.util.Scanner;

public class PatternPrinting {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Horizontal line
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        // Move to next line
        System.out.println();

        // Vertical line
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        

}
