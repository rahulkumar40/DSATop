package StringD.BasicOperation;

/*
Length of a String
Last Updated : 23 Jul, 2025
Given a string s, the task is to find the length of the string.

Examples:

Input: s = "abc"
Output:  3

Input: s = "GeeksforGeeks"
Output: 13

Input: s = ""
Output: 0
 */
public class LengthOfString {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "merndeveloper";

        // using built in function
        System.out.println("Length of String " + str + " = " + str.length());

        // using extra variable and loop
        int len = 0;
        char ch[] = str.toCharArray();
        for (char c : ch) {
            len++;
        }
        System.out.println(len);

    }
}
