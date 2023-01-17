import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int height = Integer.parseInt(tokenizer.nextToken());
        int width = Integer.parseInt(tokenizer.nextToken());
        char[][] chess = new char[height][];
        for (int i = 0; i < height; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            chess[i] = tokenizer.nextToken().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < height - 7; i++) {
            for (int j = 0; j < width - 7; j++) {
                min = Math.min(min, calcMinimumFill(chess, i, j));
            }
        }
        System.out.print(min);
    }

    public static int calcMinimumFill(char[][] arr, int h, int w) {
        char color = arr[h][w];
        int minA = 0, minB = 0;
        int height = h + 8, width = w + 8;
        for (int i = h; i < height; i++) {
            color = (i - h) % 2 == 0 ? (char) (color ^ 0x15) : arr[h][w];
            for (int j = w; j < width; j++) {
                char piece = arr[i][j];
                if (piece != color) {
                    minA++;
                } else {
                    minB++;
                }
                color ^= 0x15;
            }
        }
        return Math.min(minA, minB);
    }
}