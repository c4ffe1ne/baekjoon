import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int argA = Integer.parseInt(tokenizer.nextToken());
        int argB = Integer.parseInt(tokenizer.nextToken());

        String sign = "==";
        if (argA != argB) {
            int val = ~((argA - argB) & 0x80000000) >>> 0x1F;
            sign = String.valueOf((char) (0x3C + (val * 2)));
        }

        System.out.println(sign);
    }
}