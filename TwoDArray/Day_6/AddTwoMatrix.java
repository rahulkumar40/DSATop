package Day_6;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,6,7}, {7, 8,9}};
        int[][] matrix2 = {{11,22,30}, {44,63,72}, {71, 83,49}};
        int[][] ans = new int[matrix1.length][matrix2.length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println( );
        }
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                if(i<=j || j>=i){
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                }
                else{
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println( );
        }

    }
}
