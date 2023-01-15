import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        for (int i = 0; i < chars.length; i++) {
            char ascii = chars[i];
            int j = ascii - 0x61;
            if (alphabets[j] == -1) {
                alphabets[j] = i;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int index : alphabets) {
            builder.append(index).append(' ');
        }
        builder.deleteCharAt(builder.length() - 1);

        System.out.print(builder);
    }
}