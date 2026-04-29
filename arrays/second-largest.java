import java.util.Scanner;

class GFG {

    // method to find second largest
    public static int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } 
            else if (arr[i] > second && arr[i] != first) {
                secondLargest = arr[i];
            }
        }

        // if no second largest exists
        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);

        System.out.println(result);

        sc.close();
    }
}
