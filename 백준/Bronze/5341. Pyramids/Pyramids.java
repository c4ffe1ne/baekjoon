import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        while (true) {
            number = Integer.parseInt(reader.readLine());
            if (number == 0) {
                break;
            }
            System.out.println(number * (number + 1) / 2);
        }
    }
}