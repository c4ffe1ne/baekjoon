import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        while (number > 0) {
            builder.append(number).append(System.lineSeparator());
            number--;
        }
        System.out.print(builder);
    }
}