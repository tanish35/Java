import java.io.*;

public class test6 {
    public static void main(String[] args) throws IOException {
        String file1 = "fileoutputstream.txt";
        String file2 = "bufferedoutputstream.txt";
        int dataSize = 10_000_000;

        long start1 = System.currentTimeMillis();
        try (FileOutputStream fos = new FileOutputStream(file1)) {
            for (int i = 0; i < dataSize; i++) {
                fos.write('A');
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("FileOutputStream Time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2))) {
            for (int i = 0; i < dataSize; i++) {
                bos.write('A');
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("BufferedOutputStream Time: " + (end2 - start2) + " ms");
    }
}
