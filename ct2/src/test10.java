import java.io.*;

public class test10 {
    public static void main(String[] args) {
        String fileName = "test10.txt";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            long start = System.currentTimeMillis();

            while (fis.read() != -1) {
            }

            long end = System.currentTimeMillis();
            System.out.println("FileInputStream time: " + (end - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
            long start = System.currentTimeMillis();

            while (bis.read() != -1) {
            }

            long end = System.currentTimeMillis();
            System.out.println("BufferedInputStream time: " + (end - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
