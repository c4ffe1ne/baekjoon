import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = reader.readLine();
        }

        Arrays.sort(words, (v1, v2) -> {
            int diff = v1.length() - v2.length();
            if (diff == 0)
                return v1.compareTo(v2);
            return diff;
        });

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int j = i - 1;
            if (j >= 0 && words[i].contentEquals(words[j])) {
                continue;
            }
            builder.append(words[i]).append(System.lineSeparator());
        }
        System.out.println(builder);
    }
}