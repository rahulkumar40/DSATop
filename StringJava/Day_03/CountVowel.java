package Day_03;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = sc.nextLine();

        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i'|| ch=='o' || ch=='u'|| ch == 'A' || ch == 'E' || ch =='I'|| ch=='O' || ch=='U' ){
                count++;
            }
        }

        System.out.println("Total number of character in :  " + s + " : " + count);

        int occur = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)  == true){
                occur++;
            }
        }

        System.out.println("New way : ");
        System.out.println("Total number of character in :  " + s + " : " + occur);

    }
    static boolean isVowel(char ch){
        if(ch=='a' ||ch== 'A') return true;
        if(ch=='e' ||ch== 'E') return true;
        if(ch=='i' ||ch== 'I') return true;
        if(ch=='o' ||ch== 'O') return true;
        if(ch=='u' ||ch== 'U') return true;
        return false;
    }
}
