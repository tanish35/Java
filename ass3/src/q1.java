public class q1 {

    public static <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        boolean s;

        for (int i = 0; i < n - 1; i++) {
            s = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    T t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    s = true;
                }
            }
            if (!s) break;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 9, 1, 3};
        String[] words = {"banana", "apple", "orange"};
        Float[] floats = {3.14f, 1.59f, 2.65f};

        sort(nums);
        sort(words);
        sort(floats);
        for (float f : floats) System.out.print(f + " ");
        System.out.println();
        for (int x : nums) System.out.print(x + " ");
        System.out.println();
        for (String w : words) System.out.print(w + " ");
    }
}