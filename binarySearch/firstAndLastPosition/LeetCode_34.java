package firstAndLastPosition;

public class LeetCode_34 {
    public static void main(String[] args) {
        int nums[] = {10, 10, 20, 20, 20, 20, 30, 30, 40, 40};

        int target = 20;
        int ar[]= new int[2];
        int first = -1; 
        int second = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                first  = i; 
                break;
            }
        }
        ar[0] = first;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                second = i;
            }
        }
        ar[1] = second;
        for(int i : ar){
            System.out.print(i + " ");
        }
    }
}


