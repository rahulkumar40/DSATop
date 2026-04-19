package arraySheet.levelOne;
/*
## 1 Problem: Input and Print Array Elements

### 🔹 Problem Statement

Given an integer `n`, take `n` integers as input, store them in an array, and print all the elements.

*/
import java.util.Scanner;

public class CreateArrayWithUserInput {
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        System.out.println("Enter" + arraySize + " Array element");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Whole Array ");
        printArray(array);
    }
}
