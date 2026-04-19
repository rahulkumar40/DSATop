package arraySheet.levelOne;
/*
🔹 Problem: Find Average of Array Elements
🔹 Problem Statement

Given an array of n integers, calculate the average (mean) of all elements.
*/
public class AverageOfArray {
    static void printArray(int arr[]){
        for(int i:arr)
            System.out.print(i + " ");
        System.out.println( );
    }
    static void averageOfArray(int arr[]){
        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int arr[] = {-4,34,2,12,43,-42};
        printArray(arr);
        averageOfArray(arr);

    }
}