package StringBuilder2;

public class StringBuilder_01 {
    public static void main(String[] args) {
        String s = "abcde";

        StringBuilder n = new StringBuilder(s);
        System.out.println("This is value of s : "+s);
        StringBuilder t = new StringBuilder("Ram");
        System.out.println(t);
        System.out.println(t.length());

        StringBuilder m = new StringBuilder(10);
        System.out.println(m.capacity());

        StringBuilder r = new StringBuilder();
        int e = r.capacity();
        System.out.println("capacity of default StringBuilder : " + e);


    }
}
