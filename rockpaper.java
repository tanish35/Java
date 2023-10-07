import java.util.Scanner;
import java.util.Random;

public class rockpaper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ra= new Random();
        String t="y";
        int[] arr=new int[2];
        arr[0]=0;
        arr[1]=0;
        while (t!="n"){
            System.out.println("Enter your choice ");
            System.out.println("1 for Rock----2 for Paper----3 for Scissors");
            int u=sc.nextInt();
            int c=ra.nextInt(1,3);
            if ((c==1 && u==3)||(c==2 && u==1)||(c==3 && u==2)){
                System.out.println("You have won the game ");
                arr[0]+=1;  
                System.out.println("Your score is "+arr[0]+" The computer score is "+arr[1]);
                System.out.println("\n");
            }
            else if(c==u){
                System.out.println("Its a tie");
                System.out.println("Your score is "+arr[0]+" The computer score is "+arr[1]);
                System.out.println("\n");
            }
            else{
                System.out.println("The computer has won the match");
                arr[1]+=1;  
                System.out.println("Your score is "+arr[0]+" The computer score is "+arr[1]);
                System.out.println("\n");
            }
            System.out.println("Would you like to continue the match ?");
            System.out.println("Press y for yes and n for no");
            t=sc.next();
            System.out.println("\n\n");
       } 
       sc.close();
    }
}