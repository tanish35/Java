import java.util.*;

public class q2 {

    public static <T> void countFreq(T[] a) {
        Map<T, Integer> freq = new HashMap<>();

        for (T e : a) {
            freq.put(e, freq.getOrDefault(e, 0) + 1);
        }

        for (Map.Entry<T, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 2, 3, 1, 4, 2};
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        Float[] floats = {1.0f, 2.0f, 2.0f, 3.0f, 1.0f, 4.0f};

        System.out.println("Integer frequencies:");
        countFreq(nums);

        System.out.println("\nString frequencies:");
        countFreq(words);

        System.out.println("\nFloat frequencies:");
        countFreq(floats);
    }
}