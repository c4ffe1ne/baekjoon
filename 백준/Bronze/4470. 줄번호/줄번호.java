import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int line = Integer.parseInt(reader.readLine());
        for (int i = 1; i < line + 1; i++) {
            builder.append(i)
                    .append(". ")
                    .append(reader.readLine())
                    .append(System.lineSeparator());
        }
        System.out.print(builder);
    }
}