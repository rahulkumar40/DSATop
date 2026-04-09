package solveProblem.nineApr;

public class ReverseArray {
    static void printArr(int arr[]){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println( );
    }
    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[]){
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            swap(arr,i,n-i-1);
        }
        printArr(arr);
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        reverse(arr);
    }
}
