import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split(" ");
        int count = words.length;
        if (count != 0 && words[0].isEmpty()) {
            count--;
        }
        System.out.print(count);
    }
}