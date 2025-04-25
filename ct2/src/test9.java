import java.io.*;

public class test9 {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test9.txt")))) {
            String line = br.readLine();
            int n = line.length();
            int i = 0;
            StringBuffer s = new StringBuffer();
            boolean numeral = false;

            while (i < n) {
                char ch = line.charAt(i);

                if (ch != ' ' && ch != '\n') {
                    s.append(ch);
                    if (ch >= '0' && ch <= '9') {
                        numeral = true;
                    }
                } else {
                    if (s.length() > 0 && numeral) {
                        System.out.println("Numeral: " + s);
                        count++;
                    }
                    s.setLength(0);
                    numeral = false;
                }

                i++;
            }
            if (s.length() > 0 && numeral) {
                System.out.println("Numeral: " + s);
                count++;
            }

            System.out.println("Total numerals found: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
