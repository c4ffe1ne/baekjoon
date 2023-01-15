import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // Sort 후 첫번째와 마지막 인덱스를 가져오는게 더 편하긴하지만...
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int min = 1000000, max = -1000000;
        for (int i = 0; i < len; i++) {
            int number = Integer.parseInt(tokenizer.nextToken());
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        System.out.printf("%d %d", min, max);
    }
}