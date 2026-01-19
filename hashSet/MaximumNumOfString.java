import java.util.HashSet;

public class MaximumNumOfString {
    static String reverse(String s){
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        return st.toString();
    }
    static int maximumNumberReverse(String arr[]){
        int count = 0;
        HashSet<String> st = new HashSet<>();
        for(String ele:arr){
            if(st.contains(reverse(ele))){
                count++;
                st.remove(ele);
            }
            else st.add(ele);
        }
        return count;
    }
    public static void main(String[] args) {
        String arr[] = {"cd","ac","dc","tz","ed","de","zt"};
        System.out.println(maximumNumberReverse(arr));
    }
}
