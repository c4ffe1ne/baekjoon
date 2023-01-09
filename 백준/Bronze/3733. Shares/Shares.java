import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        while(true) {
            String command = reader.readLine();
            if (command == null) {
                break;
            }
            tokenizer = new StringTokenizer(command);
            int n = Integer.parseInt(tokenizer.nextToken());
            int s = Integer.parseInt(tokenizer.nextToken());
            System.out.println(s / (n + 1));
        }
    }
}