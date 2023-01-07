import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String stars = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stars += "*";
            builder.append(stars);
            builder.append('\n');
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.print(builder);
    }
}