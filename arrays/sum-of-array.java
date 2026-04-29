// User function Template for Java
class Solution {
    static int arraySum(int arr[]) {
        // code here
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arraySum(arr));
    }
}
