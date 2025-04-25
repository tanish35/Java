import java.util.ArrayList;

public class test11 {

    public <T extends Comparable<T>> int binarySearch(T key, T[] array, int size) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid].compareTo(key) == 0) {
                return mid;
            } else if (array[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        test11 test = new test11();
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size = array.length;
        int key = 3;
        int result = test.binarySearch(key, array, size);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("fig");

        stringList.sort(null);

        String[] stringArray = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            stringArray[i] = stringList.get(i);
        }

        String stringKey = "cherry";
        int stringResult = test.binarySearch(stringKey, stringArray, stringArray.length);
        if (stringResult == -1) {
            System.out.println("String element not found");
        } else {
            System.out.println("String element found at index: " + stringResult);
        }

    }

}
