package StringD.reverseStr;

/*
⭐ Q2. Reverse word order (not characters)
Input:  My name is amit
Output: amit is name My
*/
public class ReverseWordOrder {
    static void reverseWordOrderT(String str) {
        String st[] = str.split(" ");
        String ans = " ";
        for (int i = st.length - 1; i >= 0; i--) {
            ans += st[i] + " ";
        }
        System.out.println(ans.trim());
    }

    // without split() function
    static void reverseEntireString(String str) {
        String ans = " ";
        String word = " ";
        for (int i = str.length(); i >= 0; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;

            } else {
                ans += word + " ";
                word = " ";
            }

        }
        ans += word;
        System.out.println(ans.trim());
    }

    static void reverseWordOfString(String str) {
        String ans = " ";
        String word = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;

            } else {
                ans += word + " ";
                word = " ";
            }

        }
        ans += word;
        System.out.println(ans.trim());
    }

    public static void main(String[] args) {
        String str = "My name is amit";
        String s = "My name is Rahul";
        reverseEntireString(str);
        reverseWordOrderT(s);
    }
}
