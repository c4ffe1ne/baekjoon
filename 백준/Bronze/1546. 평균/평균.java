import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int div = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        double sum = 0, max = 0;
        for (int i = 0; i < div; i++) {
            double score = Double.parseDouble(tokenizer.nextToken());
            sum += score;
            max = Math.max(max, score);
        }
        System.out.print((sum / div) / max * 100);
    }
}