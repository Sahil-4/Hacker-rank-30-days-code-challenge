
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        // predefined variables
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Defined variables
        Scanner sc = new Scanner(System.in);

        int var1 = sc.nextInt();
        double var2 = sc.nextDouble();
        sc.nextLine();
        String var3 = sc.nextLine();

        // printing values
        System.out.println(i + var1);
        System.out.println(d + var2);
        System.out.println(s + var3);

        sc.close();
    }
}