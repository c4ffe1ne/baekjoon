import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();
        int number = Integer.parseInt(command);
        int min = number - (command.length() * 9);
        int answer = 0;
        for (int i = min; i < number; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum + i == number) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}