public class NumberOfSubArraysOfKAndAVerage {
    static int solution(int arr[], int k , int threshold){
        int n = arr.length; 
        int count =0; 
        for(int i=0; i<=n-k; i++){
            int sum =0; 
            for(int j=i; j<k+i; j++){
                sum+=arr[j];
            }
            if((sum/k)>=threshold)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,5,5,5,8};
        System.out.println(solution(arr, 3, 4));
    }
}
