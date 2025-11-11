package Day_04;

public class IndexOfInJava {
    public static void main(String[] args) {
        String s = "Rahul Kuamr";
        System.out.println(s.indexOf('K'));
        System.out.println(s.indexOf('k'));


        System.out.println(s.lastIndexOf('a'));
        System.out.println( );

        System.out.println("CompareTo 1 ");
        String a = "abc";
        String b = "dbc";

        System.out.println(a.compareTo(b));
        System.out.println("CompareTo 2 ");
        String c = "abc";
        String d = "abc";

        System.out.println(a.compareTo(d));
        System.out.println("CompareTo 3 ");
        String e = "abcffff";
        String f = "dbc";

        System.out.println(a.compareTo(f)); 

        String phy = "physics walla";
        System.out.println(phy.contains("alla"));
        System.out.println(phy.contains("rah"));
        System.out.println(phy.startsWith("phy"));

    }
}
