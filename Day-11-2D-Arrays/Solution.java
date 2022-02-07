import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    static int Max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int Sum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                        + arr.get(row + 1).get(col + 1) + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1)
                        + arr.get(row + 2).get(col + 2);
                if (Max < Sum) {
                    Max = Sum;
                }
            }
        }

        System.out.println(Max);
    }
}
