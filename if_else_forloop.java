import java.util.Scanner;

public class if_else_forloop {
    public static void main(String[] args) {
        // System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        // int sum = 0;
        // boolean t = true;
        // for (int i = 1; i <= 3; i++) {
        // System.out.println("Enter marks in " + i + " subject");
        // byte a = sc.nextByte();
        // if (a <= 33) {
        // t = false;
        // break;
        // }
        // sum = sum + a;
        // }
        // if (t == false) {
        // System.out.println("The student has failed");
        // } else {
        // if ((sum) >= 120) {
        // System.out.println("The student has passed");
        // } else {
        // System.out.println("The student has failed");
        // }
        // }

        // long a;
        // System.out.println("Enter your income ");
        // a = sc.nextLong();
        // double b, c;
        // if (a <= 250000) {
        // System.out.println("Total tax to be paid is 0 and your net income will be " +
        // a);
        // } else if (a > 250000 && a <= 500000) {
        // b = a * 0.05;
        // c = a * 0.95;
        // System.out.println("Total tax to be paid is" + b + " and your net income will be " + c);
        // } else if (a > 500000 && a <= 1000000) {
        // b = a * 0.2;
        // c = a * 0.8;
        // System.out.println("Total tax to be paid is" + b + " and your net income will be " + c);
        // } else {
        // b = a * 0.3;
        // c = a * 0.7;
        // System.out.println("Total tax to be paid is " + b + " and your net income will be " + c);
        // }

        // System.out.println("Enter the year ");
        // int a = sc.nextInt();
        // if (a % 100 == 0) {
        //     if (a % 400 == 0) {
        //         System.out.println("It is a leap year ");
        //     } else {
        //         System.out.println("It is not a leap year ");
        //     }
        // }
        // else if (a % 4 == 0) {
        //     System.out.println("It is a leap year");
        // } else {
        //     System.out.println("It is not a leap year");
        // }

        System.out.println("Enter url");
        String a=sc.nextLine();
        if (a.endsWith(".com")){
            System.out.println("It is a commercial webiste");
        }
        else if(a.endsWith(".in")){
            System.out.println("It is an indian webiste");
        }
        else if(a.endsWith(".org")){
            System.out.println("It is a government organistation");
        }
        

        sc.close();
    }
}