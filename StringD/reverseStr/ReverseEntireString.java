package StringD.reverseStr;

/*
⭐ Q1. Reverse the entire string
Input:  My name is amit
Output: tima si eman yM
*/
public class ReverseEntireString {
    static void withStringBuilder(String s){
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        System.out.println(st);
    }

    static void withSimpleLogic(String s){
        String ans = " ";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                ans = ch+ans;
            }
            else{
                ans = " "+ ans;
            }
        }
        System.out.println(ans);
    }

    static void reverseStringInPlace(String s){
        String ans = " ";
        // StringBuilder temp =new  StringBuilder();
        String temp = " ";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                ans = ch+ans;
            }
            else {
                temp +=ans + " ";
                ans = " ";
            }
        }
        // temp.append(ans);
        temp +=ans + " ";
        System.out.println(temp.trim());
    }
    public static void main(String[] args) {
        String str = "My name is Rahul";
        String ans = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        System.out.println(ans.trim());

        System.out.println("Reverse String with String Builder");
        withStringBuilder("Find Greatest common divisor of array");

        withSimpleLogic("I am confident in spoken English");
        reverseStringInPlace("I am rahul");
    }
}
