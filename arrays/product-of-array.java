import java.util.*;
class Solution {
    public static long product(long arr[]) {
        // your code here
        long prod = 1;
         int MOD = 1000000007;
        for(int i =0;i<arr.length;i++){
            prod = (prod * arr[i]) % MOD;
        }
        return prod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(product(arr));
    }
}
