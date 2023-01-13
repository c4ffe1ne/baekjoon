import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int sum = Integer.parseInt(tokenizer.nextToken());
        int diff = Integer.parseInt(tokenizer.nextToken());
        int high = (sum + diff) / 2;
        StringBuilder builder = new StringBuilder().append(-1);
        if ((sum - diff) >= 0 && (sum + diff) % 2 == 0) {
            builder.setLength(0);
            builder.append(high).append(' ').append(high - diff);
        }
        System.out.print(builder);
    }
}