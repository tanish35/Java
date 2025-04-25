import java.util.*;

public class test1 {
    public static void print_palin(String s) {
        int m = s.length();
        String temp = "";
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
                continue;
            }
            int n = temp.length();
            Boolean flag = true;
            for (int j = 0; j <= (n / 2) - 1; j++) {
                if (temp.charAt(n - j - 1) != temp.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(temp);
            }
            temp = "";
        }
        int n = temp.length();
        temp = temp.toLowerCase();
        Boolean flag = true;
        for (int j = 0; j <= (n / 2) - 1; j++) {
            if (temp.charAt(n - j - 1) != temp.charAt(j)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        print_palin(s);
        sc.close();

    }
}
