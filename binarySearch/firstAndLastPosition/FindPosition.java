package firstAndLastPosition;

public class FindPosition {
    public static void main(String[] args) {
        int nums[] = {10, 10, 20, 20, 20, 20, 30, 30, 40, 40};
        int n = nums.length; 
        int ans[] = {-1, -1};

        int target = 20;
        // first binary check if element is present 
        int lo = 0, hi = n-1;
        boolean flag = false; // false means not present 
        while(lo <= hi){
            int mid = lo + (hi -lo)/2;
            if(nums[mid] == target){
                flag = true;
                break;
            }
            else if (nums[mid ] > target) hi = mid -1;
            else lo = mid + 1;
        }
        if(flag == false) return;

        // 2nd binary check for 1st position  
        int lb = n ;
        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi -lo)/2;
            if(nums[mid] >= target){
                lb = Math.min(mid, lb);
                hi = mid -1;
            }
            else lo = mid + 1;
        } 
        ans[0] = lb;


        // 3nd binary check for last position element   
        int up = n; 
        lo = 0; hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi -lo)/2;
            if(nums[mid] > target){
                up = Math.min(mid, up);
                hi = mid -1;
            }
            else lo = mid + 1;
        }
        ans[1] = up - 1;

        for(int k : ans){
            System.out.println(k + " ");
        }
    }
}
