import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(reader.readLine());
        for (int i = 0; i < loop; i++) {
            StringBuilder builder = new StringBuilder();
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int count = Integer.parseInt(tokenizer.nextToken());
            char[] chars = tokenizer.nextToken().toCharArray();
            for (int j = 0; j < count * chars.length; j++) {
                builder.append(chars[j / count]);
            }
            System.out.println(builder);
        }
    }
}