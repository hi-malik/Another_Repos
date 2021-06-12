import java.io.*;
import java.util.*;

public class prac {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int qb[] = new int[n + 1];
        
        int same = k * 1;
        int diff = k * (k - 1);
        int total = same + diff;
        
        for(int i = 3; i <= n; i++){
            same = diff;
            diff = total * (k - 1);
            total = same + diff;
        }
        
        System.out.println(total);
        
    }
}