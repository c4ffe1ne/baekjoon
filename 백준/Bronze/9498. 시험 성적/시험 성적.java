import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numTranscript = Integer.parseInt(reader.readLine());
        char alphaTranscript = 0;
        if (numTranscript < 60) {
            alphaTranscript = 'F';
        } else {
            numTranscript /= 10;
            alphaTranscript = (char) (0x4A - numTranscript);
            if (alphaTranscript == '@') {
                alphaTranscript++;
            }
        }
        System.out.print(alphaTranscript);
    }
}