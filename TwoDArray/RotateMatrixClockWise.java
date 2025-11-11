

public class RotateMatrixClockWise {
    static void printArr(int arr[][]){
        int n = arr.length; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6},{7,8,9}};

        System.out.println("Original Array : ");
        printArr(arr);
        int n = arr.length; 
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
        System.out.println("Transpose Array : ");
        printArr(arr);

        // reverse row all row 
        for(int i=0; i<n; i++){
            int a = 0, b = n-1;
            // swap arr[i][a] and arr[i][b]
            while (a<b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp ;
                a++;
                b--;
            }
        }
        System.out.println("90 degree Array : ");
        printArr(arr);
    }
}
