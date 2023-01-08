import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder builder = new StringBuilder();
        int length = tokenizer.countTokens();
        int[] pieces = new int[] {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < length; i++) {
            int piece = Integer.parseInt(tokenizer.nextToken());
            int required = pieces[i] - piece;
            builder.append(required);
            builder.append(' ');
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.print(builder);
    }
}