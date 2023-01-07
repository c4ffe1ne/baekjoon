import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 0x41 && chars[i] <= 0x5A) {
                chars[i] += 0x20;
                continue;
            }
            chars[i] -= 0x20;
        }
        string = String.valueOf(chars);
        System.out.print(string);
    }
}