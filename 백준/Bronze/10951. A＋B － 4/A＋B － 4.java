import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String command = reader.readLine();
            if (command == null) {
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(command);
            int argA = Integer.parseInt(tokenizer.nextToken());
            int argB = Integer.parseInt(tokenizer.nextToken());
            int calc = argA + argB;
            writer.write(String.valueOf(calc));
            writer.newLine();
            writer.flush();
        }
    }
}