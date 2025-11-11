package StringBuilder2;

public class AppendInbuiltFun_05 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Rahul");
        s.append(" Kumar ");
        System.out.println("append String ");
        System.out.println(s);

        System.out.println("character append ");
        System.out.println(s.append('*'));

        System.out.println("append integer ");
        System.out.println(s.append(4));

        System.out.println("Charater array append  ");
        char []a = {'r','t'};
        System.out.println(s.append(a));

        System.out.println("StringBuilder append : ");
        StringBuilder t = new StringBuilder("Ram hi hai ");
        System.out.println(s.append(t));

        // cannt appply at int arra
    }
}
