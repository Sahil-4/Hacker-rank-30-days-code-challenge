
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String name, query;
        int number, phoneDirectorySize;

        phoneDirectorySize = sc.nextInt();

        HashMap<String, Integer> phoneDirectory = new HashMap<String, Integer>();

        for (int i = 0; i < phoneDirectorySize; i++) {
            name = sc.next();
            number = sc.nextInt();
            phoneDirectory.put(name, number);
        }

        // handle query
        while (sc.hasNext()) {
            // handle query
            query = sc.next();
            if (phoneDirectory.containsKey(query)) {
                System.out.println(query + "=" + phoneDirectory.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
