import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int time = 0;
        for (int i = 3; i > 0; i--) {
            int num = Integer.parseInt(tokenizer.nextToken());
            time += num * Math.pow(60, i);
        }
        time += Integer.parseInt(reader.readLine()) * 60;
        int hour = (int) (time / Math.pow(60, 3) % 24);
        int minute = (int) (time / Math.pow(60, 2) % 60);
        int second = (int) (time / Math.pow(60, 1) % 60);
        System.out.printf("%d %d %d\n", hour, minute, second);
    }
}
