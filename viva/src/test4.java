import java.util.*;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // HashMap<Integer, Character> mp = new HashMap<>();
        // mp.put(0, '0');
        // mp.put(1, '1');
        // mp.put(2, '2');
        // mp.put(3, '3');
        // mp.put(4, '4');
        // mp.put(5, '5');
        // mp.put(6, '6');
        // mp.put(7, '7');
        // mp.put(8, '8');
        // mp.put(9, '9');
        // mp.put(10, 'A');
        // mp.put(11, 'B');
        // mp.put(12, 'C');
        // mp.put(13, 'D');
        // mp.put(14, 'E');
        // mp.put(15, 'F');

        char[] arr = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        StringBuilder s = new StringBuilder();

        while (n != 0) {
            Integer r = n % 16;
            s.append(arr[r]);
            n /= 16;
        }
        s.reverse();
        System.out.println(s);
        sc.close();

    }
}
