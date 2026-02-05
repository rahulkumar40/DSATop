public class MimimumSizeSubarraySum {
    // 209. Minimum Size Subarray Sum
    static public int minSubArrayLen(int t, int[] arr) {
        int n = arr.length;
        int len =Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                // if(j-i<2)break;
                if(sum>=t){
                len=Math.min(len,j-i+1);
                System.out.println(j + " " + i);
                System.out.println(len);
                break;
                }
            }
        }
        // if(len>0)return len; // 1st i think this but here is catch if i return this then if not any target element parewent then it will return Integer max value so 
        // i have to prevent this so i did this 

        if(len>0 && len<=n)return len;
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));

    }
}
