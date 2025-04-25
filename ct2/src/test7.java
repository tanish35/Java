import java.io.*;
import java.util.*;

public class test7 {

    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {
            dos.writeInt(100);
            dos.writeDouble(3.14);
            dos.writeUTF("Hello");
            dos.writeChars("World");
            dos.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {

            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                sb.append(dis.readChar());
            }
            String charString = sb.toString();
            boolean booleanValue = dis.readBoolean();
            System.out.println("int: " + intValue);
            System.out.println("double: " + doubleValue);
            System.out.println("string: " + stringValue);
            System.out.println("char: " + charString);
            System.out.println("boolean: " + booleanValue);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
    }

}
