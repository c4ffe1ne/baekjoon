import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = null;
        while(!(command = reader.readLine()).contentEquals("#")) {
            int count = 0;
            char[] chars = command.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ascii = chars[i];
                if (ascii == 0x61 || ascii == 0x65 || ascii == 0x69 || ascii == 0x6F || ascii == 0x75) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}