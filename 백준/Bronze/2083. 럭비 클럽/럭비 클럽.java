import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final String JUNIOR = "Junior";
    private static final String SENIOR = "Senior";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        while (true) {
            tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            int age = Integer.parseInt(tokenizer.nextToken());
            int weight = Integer.parseInt(tokenizer.nextToken());
            if (name.contentEquals("#") && age == 0 && weight == 0) {
                break;
            }
            String section = (age > 17 || weight >= 80) ? SENIOR : JUNIOR;
            System.out.printf("%s %s\n", name, section);
        }
    }
}