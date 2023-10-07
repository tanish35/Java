import java.util.Arrays;

public class array_2 {
    public static void main(String[] args) {
        // double [] f={1.88,27.53,125.778,233.62,1.896};
        // double s=0;
        // for(double el:f){
        //     s=s+el;
        // }
        // System.out.println("The sum is "+s);
        int [] j={9,5,1,10,56,32,9,7,4};
        // int x=Arrays.binarySearch(j,6);
        // System.out.println(x);
        Arrays.sort(j);
        for(int i=j.length-1;i>=0;i--){
            System.out.print(j[i]+",");
        }



        
    }
}
