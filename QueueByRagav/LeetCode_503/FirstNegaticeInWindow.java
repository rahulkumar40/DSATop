package LeetCode_503;

public class FirstNegaticeInWindow {
  public static void window(int arr[], int k){
    int n = arr.length; 
    int ans[] = new int[n-k+1];
    
    for(int i=0; i<=n-k; i++){
      for(int j=i; j<k+i; j++){
        if(0>arr[j]){
          ans[i] = arr[j];
          break;
        }
      }

    }
    print(ans);
  }
  public static void print(int arr[]){
    for(int i: arr){
      System.out.print(i + " ");
    }
    System.out.println( );
  }
  public static void main(String[] args) {
    int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
    int b [] = {-8 ,2, 3, -6, 10};
    window(b, 2);
    print(a);
    window(a, 3);
    print(a);
    int n = 8;
    int k = 3;

  }
}
