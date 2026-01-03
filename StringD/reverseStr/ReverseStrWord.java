package StringD.reverseStr;

import java.util.Stack;

public class ReverseStrWord {
    static void reverseString(String str) {
        String[] strArr = str.split(" ");
        String ans = " ";
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i] + " ");
            String s = strArr[i];
            String st = " ";
            if (strArr[i] != " ")
                for (int j = s.length() - 1; j >= 0; j--) {
                    st = st + s.charAt(j);
                }
            ans = ans + st + " ";
        }
        System.out.println(ans.trim());
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
