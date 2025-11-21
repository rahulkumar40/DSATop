package twoPointer;

import java.util.ArrayList;

public class RemoveDuplicate {
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void duplicateArr(int arr[]) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println("Duplicate Arr ....");

        System.out.println("Ideal Eleemnt " + j);
        System.out.println();
        display(arr);
    }

    static ArrayList<Integer> duplicateList(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != list.get(list.size() - 1)) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        display(arr);
        ArrayList<Integer> list = duplicateList(arr);
        System.out.println(list);
        duplicateArr(arr);

    }
}
