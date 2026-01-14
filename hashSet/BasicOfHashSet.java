import java.util.HashSet;

public class BasicOfHashSet {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Rahul");
        st.add("Mohan");
        st.add("John");
        st.add("Rahul");

        System.out.println(st); // [Rahul,Mohan,John]
        System.out.println(st.contains("Rahul")); // true
        st.remove("John");
        System.out.println(st); // [Rahul, Mohan]
        System.out.println(st.contains("John")); // false
        System.out.println(st.size()); // 2
        for (String s : st)
            System.out.print(s + " ");

        System.out.println();

        System.out.println(st.isEmpty()); // false

        st.clear(); // clear whole set
        System.out.println(st); // []
    }
}
