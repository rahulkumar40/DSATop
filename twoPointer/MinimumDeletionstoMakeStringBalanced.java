package twoPointer;
// 1653
public class MinimumDeletionstoMakeStringBalanced {
    public static int minimumDeletions(String s) {
        int i =0, j=s.length()-1; 
        char arr[] = s.toCharArray();
        int t =0;
        while(i<j){
            char first = arr[i];
            char last = arr[j];
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else {
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
