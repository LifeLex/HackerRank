package com.problemSolving;
import java.io.*;
import java.util.*;

public class FormingAMagicSquare {
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int costOfConverting=Integer.MAX_VALUE;
        //int m = calculateMagicConstant(s);

        //All permutations of the for a 3x3 matrix that can form a magic square
        int[][][] ms = {
                { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
                { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
                { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
                { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
                { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
                { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
                { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
                { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
        };
        for (int x = 0; x < ms.length; x++) {
            int cost=0;
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    cost+= Math.abs(s[i][j]-ms[x][i][j]);
                }
            }
            costOfConverting= Math.min(costOfConverting,cost);
        }


        return costOfConverting;
    }


    private static int calculateMagicConstant(int[][] s) {
        //M= n(nˆ2+1)/2 where is the the rows/columns of the square matrix
        int m = (int) (s.length*(Math.pow(s.length,2)+1)/2);
        return m;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
