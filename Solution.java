public class Solution {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        int s=0;
        int m=0;
        for(int [] i:accounts){
            for(int j:i){
                s=s+j;
            }
            if (s>m){
                m=s;
            }
            s=0;
        }

        System.out.println(m);
    }
    
}
