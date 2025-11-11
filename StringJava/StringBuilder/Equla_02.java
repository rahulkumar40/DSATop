package StringBuilder;

public class Equla_02 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abc";
        t += "de";
        // System.out.println(s);
        // System.out.println(t);
        // System.out.println(s==t);
        // abcde
        // abcde
        // false

        String m = new String(s);
        System.out.println(s == m);
        System.out.println(s.equals(m));
        System.out.println(s.equals(t));
    
    }
}
