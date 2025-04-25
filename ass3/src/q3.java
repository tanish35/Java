import java.util.*;

public class q3 {

    public static <T> void printDuplicates(T[] a) {
        Set<T> seen = new HashSet<>();
        Set<T> duplicates = new HashSet<>();

        for (T e : a) {
            if (!seen.add(e)) {
                duplicates.add(e);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates:");
            for (T d : duplicates) {
                System.out.println(d);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 2, 4, 5, 1};
        String[] words = {"apple", "banana", "orange", "apple", "banana"};
        Float[] floats = {1.1f, 2.2f, 3.3f, 2.2f, 4.4f};

        System.out.println("Integer duplicates:");
        printDuplicates(nums);

        System.out.println("\nString duplicates:");
        printDuplicates(words);

        System.out.println("\nFloat duplicates:");
        printDuplicates(floats);
    }
}