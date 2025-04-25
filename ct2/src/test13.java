import java.io.*;

public class test13 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test13.txt")))) {

            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is a test file.");
            bw.newLine();
            bw.write("BufferedWriter is used for writing text to a file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
