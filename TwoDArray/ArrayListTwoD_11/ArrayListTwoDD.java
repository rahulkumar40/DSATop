package ArrayListTwoD_11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTwoDD {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        List<Integer> b = new ArrayList<>();

        a.add(20);
        a.add(40);
        a.add(50);

        b.add(2);
        b.add(4);
        b.add(5);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(23);
        c.add(58);
        c.add(58);

        List<Integer> d = new ArrayList<>();
        d.add(595);
        List<List<Integer>> m = new ArrayList<>();
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);

        System.out.println(m);

        // for(int i=0; i<a.size(); i++){
        //     System.out.print(a.get(i) + " ");
        // }
        // for(int i=0; i<m.size(); i++){
        //     System.out.print(m.get(i) + " ");
        // }
        // System.out.println( );

        for(int i=0; i<m.size(); i++){
            List<Integer> x = m.get(i);
            for(int j=0; j<x.size(); j++){
            System.out.print(x.get(j) + " ");
            }
        }
        

    }
}
