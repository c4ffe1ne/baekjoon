import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = null;
        while (!(command = reader.readLine()).contentEquals("0")) {
            char[] chars = command.toCharArray();
            int end = chars.length;
            String result = "yes";
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[--end]) {
                    result = "no";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}