
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String inputString;

        Scanner sc = new Scanner(System.in);

        inputString = sc.nextLine();

        sc.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);

    }
}