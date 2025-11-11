package Day_6;

public class LowerUpperCase {
    public static void main(String[] args) {
        String s = "Ragav Garg is 24 year old";
        System.out.println("original : " + s);
        System.out.println(s.toLowerCase());

        System.out.println("Originel " + s);
        System.out.println(s.toUpperCase());

        System.out.println("concatinate means add to string a and b ");
        String a = "abc";
        String b = "bcd";
        System.out.println(a.concat(b));

        // it will also happen with + 
        // System.out.println(a+b);
        

    }
}
