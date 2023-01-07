import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger argA = new BigInteger(reader.readLine());
        BigInteger argB = new BigInteger(reader.readLine());

        System.out.println(argA.add(argB));
        System.out.println(argA.subtract(argB));
        System.out.println(argA.multiply(argB));
    }
}