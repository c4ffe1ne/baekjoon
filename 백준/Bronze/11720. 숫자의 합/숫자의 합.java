import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        char[] chars = reader.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int num = chars[i] - 0x30;
            sum += num;
        }
        System.out.print(sum);
    }
}