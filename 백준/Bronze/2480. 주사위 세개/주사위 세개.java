import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int bits = 0, dup = 0, max = 0, money = 100;
        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            int flag = 1 << number;
            max = Math.max(max, number);
            boolean duplicated = (bits & flag) == flag;
            if (duplicated) {
                dup = number;
                money *= 10;
                continue;
            }
            bits |= flag;
        }

        StringBuilder builder = new StringBuilder();
        if (money == 100) {
            builder.append(max * 100);
        } else {
            builder.append(money + dup * (money / 10));
        }
        System.out.println(builder);
    }
}