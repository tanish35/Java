import java.io.*;
import java.math.BigInteger;

public class test2 {
    public static BigInteger exponent(int a, int b) {
        BigInteger base = BigInteger.valueOf(a);
        if (b == 0) {
            return BigInteger.ONE;
        }
        BigInteger half = exponent(a, b / 2);
        if (b % 2 == 0) {
            return half.multiply(half);
        } else {
            return half.multiply(half).multiply(base);
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter base:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter exponent:");
            int b = Integer.parseInt(br.readLine());

            BigInteger result = exponent(a, b);
            System.out.println(a + "^" + b + " = " + result);
            FileWriter writer = new FileWriter("result.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(a + "^" + b + " = " + result);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Result has been written to result.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
