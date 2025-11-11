package Day_3;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9};
        for(int ele : arr){
            System.out.print(ele + "");
        }    
        System.out.println( );

        int[][] b = {{3,4}, {5,6}, {6,7}};
        for(int[] ele : b){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println( );
        }

    }
}
