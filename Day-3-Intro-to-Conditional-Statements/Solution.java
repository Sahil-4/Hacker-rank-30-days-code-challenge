import java.io.*;

public class Solution {

    public static void solve(int n) {
        if ((n % 2 == 1) || (n > 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        solve(N);

        bufferedReader.close();
    }
}
