import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder(new String(new char[count]).replace('\0', '*'));
        StringBuilder result = new StringBuilder().append(builder).append(System.lineSeparator());
        for (int i = count - 1; i > -1; i--) {
            builder.deleteCharAt(builder.length() - 1);
            result.append(builder).append(System.lineSeparator());
        }
        result.deleteCharAt(result.length() - 1);
        System.out.print(result);
    }
}