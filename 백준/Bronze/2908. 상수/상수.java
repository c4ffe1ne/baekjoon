import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            builder.insert(0, c);
        }
        StringTokenizer tokenizer = new StringTokenizer(builder.toString());
        int argA = Integer.parseInt(tokenizer.nextToken());
        int argB = Integer.parseInt(tokenizer.nextToken());
        int max = Math.max(argA, argB);
        System.out.print(max);
    }
}