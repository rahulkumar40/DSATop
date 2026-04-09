package basicMath.binaryDigit;
// 338 counting bits 
public  class CoutingBits {
    static int calOnes(int n){
        String binary = "";
         while(n!=0){
            binary = n%2 + binary;
            n=n/2;
        }
        int sum = 0;
        for(char ch : binary.toCharArray()){
            if(ch=='1')sum+=1;
        }
        return sum;
    }
    public static int[] countBits(int n) {
        int ans[] = new int[n+1];
        String binary = "";
        for(int i=0; i<=n; i++){
            ans[i]=i;
            ans[i]=calOnes(ans[i]);
            //can only pass i value instead of paasing arr[i] both are same at the last
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[]=countBits(5);
        for(int i:ans)System.out.print(i + " ");
    }
}
