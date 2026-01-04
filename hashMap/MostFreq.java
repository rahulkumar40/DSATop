import java.util.HashMap;

public class MostFreq {
    // give an array, find the most frequent element in it. if there are multiple
    // elements that appear a maximum number of times , print any one of them
    public static void findD(int arr[]) {

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3, 2, 1, 4, 1 };
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (var i : arr) {
            if (!mp.containsKey(i)) {
                mp.put(i, 1);
            } else
                mp.put(i, mp.get(i) + 1);
        }

        int maxFre = 0;
        int mostFreqElement = -1;

        for (var e : mp.entrySet()) {
            if (e.getValue() > maxFre) {
                maxFre = e.getValue();
                mostFreqElement = e.getKey();
            }
        }
        // System.out.println(mp.get());?
        System.out.println(maxFre);
        System.out.println("Most frequent eleemtn is : " + mostFreqElement);

        System.out.println(mp);
    }
}
