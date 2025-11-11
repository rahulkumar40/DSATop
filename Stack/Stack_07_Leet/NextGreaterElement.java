package Stack_07_Leet;

import java.util.*;
public class NextGreaterElement {
    public static void printA(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println( );
    }
    public static void nextGreatestElement(int arr[]){
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = -1;
        }

        int n = arr.length; 
        for(int i=0; i<n-1; i++){
            for(int j = i; j<n-1; j++){
                if(arr[i] < arr[j]){
                    ans[i] = arr[j];
                 }
            }
        }
        printA(ans);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {1, 3, 2, 4};
        // int arr[] = {7, 5, 8, 3, 5};

        nextGreatestElement(arr);
        st.clear();
    }
}
