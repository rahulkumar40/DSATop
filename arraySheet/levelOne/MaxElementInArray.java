package arraySheet.levelOne;

public class MaxElementInArray {
    static void printArray(int arr[]) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    static void maxElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Maximum Element : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 43, 21, 42, 11, 44, 31, 53 };
        printArray(arr);
        maxElement(arr);

    }
}
