import java.io.*;

public class test3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test3.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test3_1.txt"))) {
            int data = bis.read();
            while (data != -1) {
                bos.write(data);
                data = bis.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
