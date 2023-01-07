import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        BigInteger money = new BigInteger(tokenizer.nextToken());
        BigInteger count = new BigInteger(tokenizer.nextToken());

        System.out.println(money.divide(count));
        System.out.println(money.mod(count));
    }
}