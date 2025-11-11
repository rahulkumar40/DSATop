package Day_5;

public class NewMaxt {
    public static void main(String[] args) {
        int [][] arr = {{4, 5}, {3, 5}, {8 , 3}};
        int m = arr.length; 
        int n = arr[0].length; 
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max Element : " + max);
    }
}
