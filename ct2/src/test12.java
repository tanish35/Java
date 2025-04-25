import java.util.*;

public class test12 {

    public <T> HashMap<T, Integer> countOccurrences(List<T> list) {
        HashMap<T, Integer> occurrences = new HashMap<>();
        for (T item : list) {
            occurrences.put(item, occurrences.getOrDefault(item, 0) + 1);
        }
        return occurrences;
    }

    public static void main(String[] args) {
        test12 obj = new test12();
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        HashMap<String, Integer> result = obj.countOccurrences(list);
        System.out.println(result);

        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("" + sb.charAt(0) + sb.charAt(1));
        System.out.println();
    }
}
