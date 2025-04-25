import java.io.*;

public class test5 {
    public static void main(String[] args) {

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test5.txt"))) {
            String str = "Hello, World!";
            byte[] bytes = str.getBytes();
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
