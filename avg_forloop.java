import java.util.Scanner;

public class avg_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg;
        int sum = 0;
        for (int j = 1; j <= 5; j++) {
            System.out.println("Enter " + j + " number");
            int a = sc.nextInt();
            sum = sum + a;
        }
        avg = (sum) / 5;
        System.out.println("The average is " + avg);
        sc.close();
    }

}
