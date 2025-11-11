package Multiplic_Day_14;

public class ArrayMultiply {
    static void print(int c[][]){
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print( c[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {2, 0, 1}, {2, 3, 1}};
        int b[][] = {{1, 2, 1}, {1, 1, 1}, {0, 3, 2}};
        int c[][] = new int[a.length][b[0].length];

        if(a[0].length != b.length){
            System.out.println("Multiplication not posible");
            return; 
        }
        // for(int i=0; i<c.length; i++){
        //     for(int j=0; j<c[0].length; j++){ 
        //         for(int k=0; k<b.length; k++){
        //             // c[i][j] = a[i][0] * b[0][i] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + .....;
        //             c[i][j] += a[i][k]*b[k][j];
        //         }
        //         System.out.print( c[i][j] + " ");
        //     }
        //     System.out.println( );
        // }

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                for(int k=0; k<b.length; k++){
                    // c[i][j] = a[i][0] * b[0][i] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + .....;
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        print(a);
        print(b);
        print(c);
    }
}
