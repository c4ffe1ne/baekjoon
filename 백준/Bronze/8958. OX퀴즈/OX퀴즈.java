import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            int sum = 0;
            int score = 0;
            char[] chars = reader.readLine().toCharArray();
            for (char c : chars) {
                score = c == 'X' ? 0 : (score + 1);
                sum += score;
            }
            System.out.println(sum);
        }
    }
}