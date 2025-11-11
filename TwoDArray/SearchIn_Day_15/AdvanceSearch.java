package SearchIn_Day_15;

public class AdvanceSearch {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int m = arr.length;
        int n = arr[0].length; 
    
        int i=0; 
        int x = 10;
        int j=m-1;
        while (i<n && j>=0) {
            if(arr[i][j]==x){

            System.out.println("true");
            break;
            }
            else if(arr[i][j]>x){
                j--;
            }
            else{
                i++;
            }
            
        }
    }
}
