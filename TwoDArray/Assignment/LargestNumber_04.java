/*
 write a program to find the largest element of given 2D Array of integers.
 */
package Assignment;

public class LargestNumber_04 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 4, 6}, {2, 4, 5, 7}, {3, 5, 6, 8},{4, 6, 7, 9}};

        int m=matrix.length;
        int n = matrix[0].length;
        int left = 0, right = matrix.length-1;
        while (left<n && right>0) {
            if(matrix[left][right] == 9){
                System.out.println("True");
                break;
            }
            else if (matrix[left][right] > 9) {
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(left + " " +right);
    }
}
