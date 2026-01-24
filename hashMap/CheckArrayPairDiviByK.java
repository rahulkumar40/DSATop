import java.util.*;
public class CheckArrayPairDiviByK {
    static boolean canArrange(int arr[], int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i] % k;
            if(ele<0) ele = k+ele;
            mp.put(ele, mp.getOrDefault(ele, 1) + 1);
        }
        if(mp.containsKey(0)){
            if(mp.get(0)%2!=0) return false;
            mp.remove(0);
        }

        for(int key : mp.keySet()){
            int remainingKey = k-key;
            if(!mp.containsKey(remainingKey))return false;
            int keyFreq=mp.get(key);
            int remFreq = mp.get(remainingKey);
            if(keyFreq!=remFreq)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr,k));
    }
}
