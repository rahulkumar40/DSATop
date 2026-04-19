package arraySheet.levelOne;
/*
 Problem: Find Sum of All Elements in an Array

### 🔹 Problem Statement

Given an array of `n` integers, calculate and return the **sum of all elements**.

*/
public class SumOfArrayElement {
    static void printArray(int arr[]){
        for(int ele : arr)
            System.out.print(ele + " ");
        System.out.println( );
    }
    static void arraySum(int arr[]){
        int sum = 0;
        for(int element : arr){
            sum+=element;
        }
        System.out.println("Sum Of Array Element = "+sum);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,3,2};
        printArray(arr);
        arraySum(arr);
    }
}
