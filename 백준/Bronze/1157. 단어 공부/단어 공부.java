import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        int[] alphabets = new int[26];

        int highIndex = -1;
        char answer = '?';
        for (char c : chars) {
            c -= (c > 0x5A ? 0x61 : 0x41);
            alphabets[c]++;
            if (alphabets[c] > highIndex) {
                highIndex = alphabets[c];
                answer = (char) (c + 0x41);
            } else if (alphabets[c] == highIndex) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}