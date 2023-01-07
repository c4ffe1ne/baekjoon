import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int y = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());

        // 행렬 받기
        int[][] table = new int[y * 2][x];
        for (int i = 0; i < table.length; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        // 행렬 계산 및 출력
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int sum = table[i][j] + table[i + y][j];
                builder.append(sum);
                builder.append(' ');
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.append('\n');
        }
        builder.deleteCharAt(builder.length() - 1);

        System.out.print(builder);
    }
}