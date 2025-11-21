package twoPointer;

public class ReverseAString {
    static void reverseStr(String str) {
        char[] ch = str.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String reverse = new String(ch);
        System.out.println("Reverse String : " + reverse);
    }

    public static void main(String[] args) {
        String str = "RahulKumar";
        System.out.println(str);
        reverseStr(str);
    }
}
