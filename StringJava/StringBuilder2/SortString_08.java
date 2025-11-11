package StringBuilder2;

import java.util.Arrays;

public class SortString_08 {
    public static void main(String[] args) {
        String s = "Rahul";
        char[] g = s.toCharArray();
        Arrays.sort(g);

        for(char i : g){
            System.out.print(i + " ");
        }
        
        char[] ch = {'r', 'a', 'h', 'u', 'l'};
        System.out.println(s);
        Arrays.sort(ch);
        for(char i : ch){
            System.out.print(i + " ");
        }
    }
}
