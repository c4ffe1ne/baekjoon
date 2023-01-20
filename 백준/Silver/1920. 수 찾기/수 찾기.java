import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(numbers);

        StringBuilder builder = new StringBuilder();
        n = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            int ret = Arrays.binarySearch(numbers, num) < 0 ? 0 : 1;
            builder.append(ret).append(System.lineSeparator());
        }

        System.out.print(builder);
    }
}