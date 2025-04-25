import java.io.*;

public class test3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            String s = "Hello World";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.flush();
            fos.write(' ');
            fos.write(b, 0, 5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("test.txt")) {
            byte[] b = new byte[1024];
            fis.read(b);
            // String s = new String(b, 0, len);
            String s = new String(b);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
