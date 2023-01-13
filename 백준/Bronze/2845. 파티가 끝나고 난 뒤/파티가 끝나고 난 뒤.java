import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int peoples = Integer.parseInt(tokenizer.nextToken()) * Integer.parseInt(tokenizer.nextToken());
        StringBuilder builder = new StringBuilder();
        tokenizer = new StringTokenizer(reader.readLine());
        while (tokenizer.hasMoreTokens()) {
            int news = Integer.parseInt(tokenizer.nextToken());
            builder.append(news - peoples).append(' ');
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.print(builder);
    }
}