import java.util.*;

public class test6 {
    public static <T> void freq(T arr[]) {
        HashMap<T, Integer> mp = new HashMap<>();

        for (T it : arr) {
            mp.put(it, mp.getOrDefault(it, 0) + 1);
        }

        for (T it : mp.keySet()) {
            System.out.println(it + " has appeared " + mp.get(it));
        }

    }

    public static void main(String[] args) {
        String[] data = { "a", "b", "a", "c", "b", "a" };
        freq(data);

    }
}
