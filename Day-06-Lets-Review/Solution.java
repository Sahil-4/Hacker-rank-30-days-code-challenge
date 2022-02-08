import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();

        for (int i = 0; i < test_cases; i++) {
            String str = sc.next();
            char[] charArr = str.toCharArray();
            String even_chars = "", odd_chars = "";

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    even_chars = even_chars + String.valueOf(charArr[j]);
                } else {
                    odd_chars = odd_chars + String.valueOf(charArr[j]);
                }
            }

            System.out.print(even_chars);
            System.out.print(" ");
            System.out.println(odd_chars);
        }

        sc.close();
    }
}

// javac Solution.java ; java Solution