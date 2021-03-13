package com.problemSolving;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int lengthOfLongestSubarray = 0;
        Collections.sort(a);
        int x=0;
        //find subarrays
        for (int i = 0; i < a.size(); i++) {
            if (Math.abs(a.get(x)-a.get(i))>1){
                x=i;
            }
            lengthOfLongestSubarray=Math.max(lengthOfLongestSubarray,i-x+1); // i-x+1 example (1 1 2 2 2 3) 0-0+1, 1-0+1, 2-0+1, 3-0+1, 4-0+1, 5-5+1
        }
        return lengthOfLongestSubarray;
    }

}
class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = PickingNumbers.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}