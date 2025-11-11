package Stack_00;

/**
 * AllTill_30_07_24
 */
import java.util.*;
public class AllTill_30_07_24 {
    static void display(Stack<Integer> st ){
        while(st.size()!=0){
            System.out.print(st.pop() + " ");
        }
        System.out.println( );
    }
    static void reverseStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        // for(int i=0; i<5; i++){
        //     int k = sc.nextInt();
        //     st.push(k);
        // }
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
        st.push(87);
        System.out.println(st);
        reverseStack(st);
        // display(st);
        // // while()
        // reverseStack(st);
        sc.close();
    }
}