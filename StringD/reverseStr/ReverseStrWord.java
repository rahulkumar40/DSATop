package StringD.reverseStr;

import java.util.Stack;

public class ReverseStrWord {
    static void reverseString(String str) {
        String[] strArr = str.split(" ");
        // here split break string into several word which don't include " "
        String ans = " ";
        for (int i = 0; i < strArr.length; i++) {

            String s = strArr[i];
            String st = " ";
            // if (strArr[i] != " ")
            for (int j = s.length() - 1; j >= 0; j--) {
                // st = st + s.charAt(j);
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            // ans = ans + st + " ";
        }
        // System.out.print(ans.trim());
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "My name is Rahul";

        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                st.push(ch);
            } else {
                while (!st.isEmpty()) {
                    ans = ans + st.pop();
                }
            }
            ans += " ";
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println(st);
        System.out.println(ans.trim());
        reverseString(str);

    }
}
