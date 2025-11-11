package Pacal_Day_13;

import java.util.*;
public class PascalTringal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    int n = sc.nextInt();

    List<List<Integer>> ans = new ArrayList<>(n);

    for(int i=0; i<ans.size(); i++){
        List<Integer> arr = new ArrayList<>();

        for( int j=0; j<=i; j++){
            arr.add(1);
        }

        ans.add(arr);
    }


    for(int i=2; i<ans.size(); i++){
        // List<Integer> arr = new ArrayList<>();

        for( int j=1; j<j; j++){

            ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
        }
    }
    System.out.println(ans);
 }
}
