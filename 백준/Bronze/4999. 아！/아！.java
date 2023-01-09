import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ah = reader.readLine().length() - reader.readLine().length();
        if (ah < 0) {
            System.out.println("no");
            return;
        }
        System.out.println("go");
    }
}