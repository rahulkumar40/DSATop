import java.util.HashMap;

/*
    Ques : 
        Given an array, find the most frequent element in it. if there are multiple element that appear a maximum number of times, pring ay one of them.

        Sample Input : 
            n = 6
            arr[] = {1,3,2,1,4,1}

        Expected Output : 
        1
*/
public class FrequnetElement {
    static void frequencyWithHashMap(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

            // other way to do same thing
            // if (mp.containsKey(arr[i])) {
            //      mp.put(arr[i], mp.get(arr[i])+1)
            // } else
            // mp.put(arr[i], 1);
        }

        int maxEle = 0;
        int freValue = 0;
        for (var e : mp.entrySet()) {
            if (e.getValue() > maxEle) {
                maxEle = e.getKey();
                freValue = e.getValue();
            }
        }

        System.out.println("Maximum frequent number is " + maxEle + " and its value is " + freValue);
        System.out.println(mp);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1 };
        int n = 6;

        frequencyWithHashMap(arr, n);
    }
}
