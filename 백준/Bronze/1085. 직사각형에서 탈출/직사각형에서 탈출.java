import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(tokenizer.nextToken()), y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken()), h = Integer.parseInt(tokenizer.nextToken());
        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);
        int min = Math.min(minX, minY);
        System.out.print(min);
    }
}