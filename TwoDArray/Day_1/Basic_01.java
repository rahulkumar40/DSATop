package Day_1;

public class Basic_01 {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];

        // 10 20 30 
        // 30 30 59
        // 10 50 50
        grid[0][0] = 00;
        grid[0][1] = 30;
        grid[0][2] = 20;
        grid[1][0] = 10;
        grid[1][1] = 20;
        grid[1][2] = 30;
        grid[2][1] = 80;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                System.out.print(grid[i][j] + " " );
            }
            System.out.println( );
        }

        }
}
