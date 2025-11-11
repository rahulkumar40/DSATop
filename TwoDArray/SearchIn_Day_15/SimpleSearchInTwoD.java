package SearchIn_Day_15;
// write an efficeint algrothm that searches for a value target in the m x n integer matrix which has the following properties
// i. integers in each row are sorted in ascending from left to right
// ii. inters in each column are sorted in asending from top to bottom.

public class SimpleSearchInTwoD {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6}, {4,3,2}};
        int x = 4;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==x){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
