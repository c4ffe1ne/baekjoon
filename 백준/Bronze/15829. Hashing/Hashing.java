import java.io.*;

public class Main {
    private static final int R = 31;
    private static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String text = reader.readLine();
        System.out.println(toHash(text, length));
    }

    public static long toHash(String text, int length) {
        long sum = 0;
        char[] chars = text.toCharArray();
        for (int i = 0; i < length; i++) {
            int number = chars[i] - 0x60;
            long pow = (long) Math.pow(R, i) % M;
            sum += number * pow;
        }
        return sum % M;
    }
}