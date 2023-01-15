import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int prev = Integer.parseInt(tokenizer.nextToken());
        int next = 0;
        while (tokenizer.hasMoreTokens()) {
            next = Integer.parseInt(tokenizer.nextToken());
            int sub = prev - next;
            if (!(sub == 1 || sub == -1)) {
                System.out.print("mixed");
                return;
            }
            prev = next;
        }
        String result = next == 1 ? "descending" : "ascending";
        System.out.print(result);
    }
}