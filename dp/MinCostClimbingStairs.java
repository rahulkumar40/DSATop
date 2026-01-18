package dp;

import java.util.Arrays;

public class MinCostClimbingStairs {
    static int minCost(int cost[],int idx,int dp[]){
        if(idx==0||idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]= cost[idx] +Math.min(minCost(cost, idx-1,dp),minCost(cost, idx-2,dp));
    }

    static int minCostClimbingStairs(int cost[]){
        int n = cost.length;
        int []dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost, n-2,dp));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,50,6};
        minCost(arr, arr.length, arr);
    }
}
