import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.println("Enter 1st number");
        //int a=sc.nextInt();
        //System.out.println("Enter number 2");
        //double d=sc.nextDouble();
        //System.out.println("Enter number 3");
        //int b=sc.nextInt();
        //System.out.print("The sum is: ");
        //double sum=a+b+d;
        //System.out.println(sum);
        System.out.println("Enter a text ");
        String str=sc.next();
        System.out.println("next line");
        String str1=sc.nextLine();
        System.out.println(str1+str);
        sc.close();
        

    }
    
}
