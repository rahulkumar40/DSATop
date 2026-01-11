package StringD.BasicOperation;

/*
    Problem : Check if two strings are same or not 
    Given two String, the task is to check if these two strings are identical or not consider case senstivity.
    
*/
public class CheckForSame {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "abc";
        if (s1 == s2)
            System.out.println("s1 is equal to s2");
        else
            System.out.println("s1 is not equal to s2");

        // 2 method
        if (s1.equals(s2))
            System.out.println("s1 is equal to s2");
        else
            System.out.println("s1 is not equal to s2");

        // 3rd method
        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                flag = true;
            }
        }

        if (!flag == true)
            System.out.println("s1 is equal to s2");
        else
            System.out.println("s1 is not equal to s2");

    }
}
