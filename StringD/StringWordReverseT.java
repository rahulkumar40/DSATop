package StringD;

public class StringWordReverseT {
    // input : "My name is Raushan Kumar";
    // output : "yM eman si nahsuaR ramuK "

    static void reverseStringWord(String str) {
        String result = "";
        String st[] = str.split(" ");
        for (int i = 0; i < st.length; i++) {
            String s = st[i];
            String reverse = " ";
            for (int j = s.length() - 1; j >= 0; j--) {
                reverse += s.charAt(j);
            }
            result += reverse + " ";
        }
        System.out.println(result.trim());
    }

    static void reverseStringWordWithoutSplit(String str) {
        String result = "";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result = ch + result;
            } else {
                ans += result + " ";
                result = " ";
            }

        }
        ans += result;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "My name is Raushan Kumar";
        String str1 = "My name is Rahul Kumar";
        reverseStringWord(str);
        reverseStringWordWithoutSplit(str1);
    }
}
