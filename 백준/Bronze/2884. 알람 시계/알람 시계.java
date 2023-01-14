import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int HOUR = 3600;
    private static final int MINUTE = 60;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int time = -(45 * MINUTE);
        time += (Integer.parseInt(tokenizer.nextToken()) * HOUR);
        time += (Integer.parseInt(tokenizer.nextToken()) * MINUTE);
        if (time < 0) {
            time += (24 * HOUR);
        }
        System.out.printf("%d %d", time / HOUR % 24, time / MINUTE % 60);
    }
}