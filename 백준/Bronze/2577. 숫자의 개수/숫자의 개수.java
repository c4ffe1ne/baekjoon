import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 흠.. 반복문을 줄일 방법이 없으려나..
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            sum *= Integer.parseInt(reader.readLine());
        }

        int[] numbers = new int[10];
        char[] chars = String.valueOf(sum).toCharArray();
        for (char c : chars) {
            c -= 0x30;
            numbers[c]++;
        }

        StringBuilder builder = new StringBuilder();
        for (int count : numbers) {
            builder.append(count).append(System.lineSeparator());
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.print(builder);
    }
}