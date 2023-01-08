import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int argA = Integer.parseInt(tokenizer.nextToken());
            int argB = Integer.parseInt(tokenizer.nextToken());
            if (argA == 0 && argB == 0) {
                break;
            }
            writer.write(argA > argB ? "Yes" : "No");
            writer.newLine();
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}