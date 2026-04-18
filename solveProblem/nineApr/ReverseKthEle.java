package solveProblem.nineApr;
import java.util.*;
public class ReverseKthEle {
    static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println( );
    }

    static void rotate(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotatedArr(int arr[], int k){
        int n = arr.length;
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        rotate(arr, 0, n-1);
        printArr(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Element : \n");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        rotatedArr(arr,4);
    }
}
