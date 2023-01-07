import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String credit = reader.readLine();
        double score = 0.0;
        if (!credit.contentEquals("F")) {
            score += 0x45 - credit.charAt(0);
            char sign = credit.charAt(1);
            if (sign == '+') {
                score += 0.3;
            } else if (sign == '-') {
                score -= 0.3;
            }
        }
        System.out.print(score);
    }
}