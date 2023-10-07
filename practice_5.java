import java.util.Scanner;
public class practice_5{
    public static void main(String[] args) {
        // for (int i=4;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number whose table you want ");
        // int a=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(a+" X "+i+" = "+a*i);
        // }
        
        System.out.println("Enter the number whose factorial you want");
        int a=sc.nextInt();
        long f=1l;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("The factorial of "+a+" is "+f);
        sc.close();
    }
}