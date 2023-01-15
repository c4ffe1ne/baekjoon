import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> quotients = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            quotients.add(number % 42);
        }
        System.out.print(quotients.size());
    }
}