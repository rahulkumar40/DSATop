package Stack_02;
import java.util.*;

public class PushEleAtAnyIdx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner scA = new Scanner(System.in);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack. :: ");
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        System.out.println(temp);
        st.push(50);
        while (temp.size()!=0) {
            st.push(temp.pop());
        }
        System.out.println(st);

        System.out.println("Enter the index. :: ");
        int idx = scA.nextInt();
        System.out.println("Enter the value added at index. :: ");
        int element = scA.nextInt();
        Stack<Integer> tempA= new Stack<>();
        while(st.size()>=idx){

             tempA.push(st.pop());
        }
        st.push(element);

        System.out.println(st);
        System.out.println(tempA);
        while (tempA.size()!=0) {
            st.push(tempA.pop());
        }
        System.out.println("After implement :: ");
        System.out.println(st);

        scA.close();
    }
}
