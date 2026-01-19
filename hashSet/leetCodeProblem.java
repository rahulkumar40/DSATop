import java.util.HashSet;
import java.util.Set;

public class leetCodeProblem {
    static int reverse(int n) {
        int reverseN = 0;
        while (n != 0) {
            int digit = n % 10;
            reverseN = reverseN * 10 + digit;
            n = n / 10;
        }
        return reverseN;
    }

    static int countDistinctIntegersReverse(int arr[]) {
        int n = arr.length;
        Set<Integer> st = new HashSet<>();
        for (int ele : arr) {
            st.add(ele);
            st.add(reverse(ele));
        }
        return st.size();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 13, 10, 12, 31, };
        int distinctNumber = countDistinctIntegersReverse(arr);
        System.out.println(distinctNumber);
    }
}
/*
    leetcode - 2442  : count number of disticn integer after reverse operation 
    problem statement : 
        count number 
*/
