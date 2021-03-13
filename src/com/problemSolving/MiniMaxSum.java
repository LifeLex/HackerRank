package com.problemSolving;
import java.util.*;


public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long maximum=0;
        long minimum=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            minimum=minimum+arr[i];
        }
        for (int i = arr.length-1; i >0; i--) {
            maximum=maximum+arr[i];
        }
        System.out.println(minimum+" "+maximum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
