import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, index = 0;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(reader.readLine());
            if ((max = Math.max(max, number)) == number) {
                index = i;
            }
        }
        System.out.printf("%d\n%d", max, index + 1);
    }
}