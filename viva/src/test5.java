import java.util.*;
import java.io.*;

public class test5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mp = new HashMap<>();
        String s = "";
        try {
            s = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String maxS = "";
        String tempS = "";
        int n = s.length();
        int maxK = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                tempS += s.charAt(i);
                k++;
            } else {
                if (maxK < k) {
                    maxK = k;
                    maxS = tempS;
                }
                mp.put(tempS, mp.getOrDefault(tempS, 0) + 1);
                k = 0;
                tempS = "";
            }
        }
        mp.put(tempS, mp.getOrDefault(tempS, 0) + 1);
        if (k > maxK) {
            maxK = k;
            maxS = tempS;
        }
        System.out.println("Length of longest word is " + maxK);
        System.out.println("The number of times it appears is " + mp.getOrDefault(maxS, 0));
    }

}