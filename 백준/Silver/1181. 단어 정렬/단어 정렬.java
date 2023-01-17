import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] words = new String[size];
        // 오름차순 & 사전순 정렬
        for (int i = 0; i < size; i++) {
            String word = reader.readLine();
            words[i] = word;
            int j = i - 1;
            while (j >= 0 && (word.length() < words[j].length() || (word.length() == words[j].length() && word.compareTo(words[j]) < 0))) {
                words[j + 1] = words[j];
                j--;
            }
            words[j + 1] = word;
        }

        // 중복 제거 출력
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