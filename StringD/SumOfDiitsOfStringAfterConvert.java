package StringD;

/*
Problem in Your Code

This line is wrong:

num = num*10 + digit;

Why?

If digit = 26, then:

num = num * 10 + 26


This does NOT correctly append "26" — it merges digits incorrectly.

Example:

s = "zb"
Expected mapping: "26" + "2" = "262"
Your code builds: num = 26*10 + 2 = 262 (works here by luck)

But for longer sequences, it breaks due to place value mismatch.

✅ Correct Approach: Add digits one-by-one

Instead of treating digit as a whole number, split its digits and add them properly.
*/
public class SumOfDiitsOfStringAfterConvert {
    static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    static int getLucky(String s, int k) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = (ch - 'a') + 1;
            while (val > 0) {
                num += val % 10;
                val /= 10;
            }
        }

        for (int i = 1; i < k; i++) {
            num = sumOfDigit(num);
            System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
        // System.out.println(('z'-'a') + 1);
        System.out.println(getLucky("dbvmfhnttvr", 5));
    }
}
