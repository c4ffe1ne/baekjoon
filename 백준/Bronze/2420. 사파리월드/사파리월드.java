import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        long argA = Long.parseLong(tokenizer.nextToken());
        long argB = Long.parseLong(tokenizer.nextToken());

        System.out.println(Math.abs(argA - argB));
    }
}