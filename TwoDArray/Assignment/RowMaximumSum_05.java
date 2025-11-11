/*
 * write a program to print the row number having the maximum sum in a given maxtrix 
 */
package Assignment;

public class RowMaximumSum_05 {
    public static void main(String[] args) {
        int m[][] = {{1, 2, 5, 7},{3, 4, 7, 8}, {1, 4, 12, 3}};

        int n = m[0].length;
        int k = m.length; 
        int sumx = 0;
        int r = -1;
        for(int i=0; i<k; i++){
        int sum = 0;
            for(int j=0; j<n; j++){
                sum = sum + m[i][j];
            }
            if(sumx < sum){
                sumx = sum;
                r++;
            }
            System.out.println(sum +"  row   "+i);

        }
        System.out.println(sumx + " row number : " + r);
    }
}
