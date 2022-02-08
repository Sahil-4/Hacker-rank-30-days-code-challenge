import java.io.*;
import java.util.*;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age += 1;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();

        for (int i = 0; i < TestCases; i++) {
            int initialAge = sc.nextInt();
            Person Alpha = new Person(initialAge);
            Alpha.amIOld();

            for (int j = 0; j < 3; j++) {
                Alpha.yearPasses();
            }
            Alpha.amIOld();
            System.out.println("");
        }

        sc.close();

    }
}