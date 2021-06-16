import java.util.*;
class lc1 {
    public int maxProfit(int[] prices) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < prices.length; i++){
            prices[i] = scn.nextInt();
        }
        int lsf = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op > pist){
                op = pist;
            }
        }
        System.out.println(op);
    }
    
}