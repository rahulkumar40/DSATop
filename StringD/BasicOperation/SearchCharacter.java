package StringD.BasicOperation;

import HomeWork.reveseStackRecurs_01;

/*
    Problem :   
        Program to search a character in a string 
    Given a character ch and a string s, the task is to find the index of first occurrence of the character in the string, if the character is not presen in the string, return -1;

*/
public class SearchCharacter {
    static int findCharacterIndex(String s, char k) {
        int ans = s.indexOf(k);
        return ans != -1 ? ans : -1;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char key = 'k';

        // 1 method
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == key) {
                System.out.println(key + " Find at " + i + " index");
                return;
            }
            i++;
        }

        // 2nd method
        findCharacterIndex(s, key);

    }
}
