public class HollowPalindrome {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (hollow palindrome shape)
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*"); // Boundary
                } else {
                    System.out.print(" "); // Hollow
                }
            }
            System.out.println();
        }
    }
}
