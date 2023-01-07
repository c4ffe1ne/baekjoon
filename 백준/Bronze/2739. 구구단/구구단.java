import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX_MULTIPLY_NUM = 9;
    private static final String PRINT_FORMAT = "%d * %d = %d";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= MAX_MULTIPLY_NUM; i++) {
            builder.append(String.format(PRINT_FORMAT, number, i, number * i));
            builder.append('\n');
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.print(builder);
    }
}